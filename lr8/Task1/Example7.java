package lr8.Task1;

import java.io.*;

public class Example7 {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            // Создание MyFile1.txt с тестовыми данными, если его нет
            File f1 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile1.txt");
            if (!f1.exists()) {
                try (BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(f1), "UTF-8"))) {
                    writer.write("Привет, мир!\n");
                    writer.write("Hello, world!\n");
                    writer.write("Тестовая строка.\n");
                    System.out.println("Создан MyFile1.txt с тестовыми данными.");
                }
            }

            // Чтение из MyFile1.txt и запись в MyFile2.txt
            File f2 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile2.txt");

            // Преобразование байтовых потоков в символьные с буфером 1 КБ
            in = new BufferedReader(
                    new InputStreamReader(new FileInputStream(f1), "UTF-8"), 1024);
            out = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(f2), "UTF-8"), 1024);

            String line;
            System.out.println("Содержимое MyFile1.txt:");
            while ((line = in.readLine()) != null) {
                out.write(line + "\n");
                System.out.println(line);
            }
            out.flush(); // Сброс буфера
            System.out.println("Данные записаны в MyFile2.txt");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии: " + e.getMessage());
            }
        }
    }
}