package lr8.Task1;

import java.io.*;
import java.net.URL;

public class Example8 {
    public static void readAllByChar(Reader in) throws IOException {
        while (true) {
            int oneChar = in.read(); // Читает 1 символ
            if (oneChar != -1) { // Признак конца потока
                System.out.print((char) oneChar);
            } else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // 1. Чтение из файла
            File f1 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile1.txt");
            if (!f1.exists()) {
                try (BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(f1), "UTF-8"))) {
                    writer.write("Привет, мир!\nТестовая строка.\n");
                    System.out.println("Создан MyFile1.txt с тестовыми данными.");
                }
            }
            InputStream inFile = new FileInputStream(f1);
            Reader rFile = new BufferedReader(
                    new InputStreamReader(inFile, "UTF-8")); // Буферизация и UTF-8
            System.out.println("Чтение из файла:");
            readAllByChar(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            // 2. Чтение из интернет-страницы
            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl = new BufferedReader(
                    new InputStreamReader(inUrl, "UTF-8")); // Буферизация и UTF-8
            System.out.println("Чтение из интернета:");
            readAllByChar(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();

            // 3. Чтение из массива байтов
            InputStream inArray = new ByteArrayInputStream(new byte[]{5, 8, 3, 9, 11});
            Reader rArray = new BufferedReader(
                    new InputStreamReader(inArray, "UTF-8")); // Буферизация и UTF-8
            System.out.println("Чтение из массива байтов:");
            readAllByChar(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}