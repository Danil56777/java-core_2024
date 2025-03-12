package lr8.Task1;

import java.io.*;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter fileOut = null;
        PrintWriter consoleOut = null;

        try {
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

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(f1), "UTF-8"));
            File f2 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile2.txt");
            fileOut = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(f2), "UTF-8"));
            consoleOut = new PrintWriter(System.out, true);

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String formattedLine = lineCount + ": " + s;
                fileOut.println(formattedLine); // Запись в файл
                consoleOut.println(formattedLine); // Вывод на консоль
            }
            System.out.println("Данные записаны в MyFile2.txt");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fileOut != null) {
                    fileOut.flush();
                    fileOut.close();
                }
                if (consoleOut != null) {
                    consoleOut.flush();
                    consoleOut.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии: " + e.getMessage());
            }
        }
    }
}