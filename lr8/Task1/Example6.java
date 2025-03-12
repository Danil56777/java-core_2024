package lr8.Task1;

import java.io.*;

public class Example6 {
    public static void main(String[] args) {
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

            // Чтение из MyFile1.txt и запись в MyFile2.txt с номерами строк
            File f2 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile2.txt");
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(f1), "UTF-8"));
                 BufferedWriter writer = new BufferedWriter(
                         new OutputStreamWriter(new FileOutputStream(f2), "UTF-8"))) {
                String line;
                int lineNumber = 1;
                while ((line = reader.readLine()) != null) {
                    writer.write(lineNumber + ": " + line + "\n");
                    lineNumber++;
                }
                System.out.println("Данные записаны в MyFile2.txt с номерами строк.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}