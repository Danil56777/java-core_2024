package lr8.Task1;

import java.io.*;
import java.net.URL;

public class Example2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); // Читает 1 байт
            if (oneByte != -1) { // Если не конец потока
                System.out.print((char) oneByte);
            } else {
                System.out.print("\nконец");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile1.txt");
            if (file.exists() && file.length() == 0) {
                file.delete();
                System.out.println("Пустой файл MyFile1.txt удалён.");
            }
            if (!file.exists()) {
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    String testData = "Hello, world!\nThis is a test file.";
                    fos.write(testData.getBytes("UTF-8"));
                    System.out.println("Файл MyFile1.txt создан с тестовыми данными: " + testData);
                } catch (IOException e) {
                    System.out.println("Ошибка при создании файла: " + e.getMessage());
                }
            }
            InputStream inFile = new FileInputStream(file);
            System.out.println("Чтение из файла:");
            readAllByByte(inFile);
            System.out.print("\n\n");
            inFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            System.out.println("Чтение из интернета:");
            readAllByByte(inUrl);
            System.out.print("\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{5, 8, 3, 9, 11});
            System.out.println("Чтение из массива байтов:");
            readAllByByte(inArray);
            System.out.print("\n\n");
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}