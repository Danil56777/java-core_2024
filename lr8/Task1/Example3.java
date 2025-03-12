package lr8.Task1;

import java.io.*;

public class Example3 {
    public static void main(String[] args) {
        try {
            File file = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile1.txt");

            if (!file.exists()) {
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    String testData = "Hello, world!\nThis is a test.";
                    fos.write(testData.getBytes("UTF-8"));
                    System.out.println("Файл MyFile1.txt создан с тестовыми данными: " + testData);
                } catch (IOException e) {
                    System.out.println("Ошибка при создании файла: " + e.getMessage());
                    return;
                }
            }

            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[5]; // Буфер размером 5 байт
            int bytesRead;

            System.out.println("Чтение из файла с буфером по 5 байт:");
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            System.out.println("\nконец");

            fis.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}