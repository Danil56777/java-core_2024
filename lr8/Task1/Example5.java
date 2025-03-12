package lr8.Task1;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();

        try {
            // Создание файла
            File f1 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/" + fname);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());

            // Ввод количества строк
            System.out.print("Введите количество строк для записи в файл => ");
            int n = sc.nextInt();
            sc.nextLine(); // Очистка буфера

            // Запись строк в файл в текстовом формате
            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f1), "UTF-8")) {
                for (int i = 0; i < n; i++) {
                    System.out.print("Введите строку для записи в файл => ");
                    String s = sc.nextLine();
                    writer.write(s + "\n"); // Запись строки с переносом
                }
                writer.flush();
            }

            // Чтение и вывод данных из файла
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f1), "UTF-8"))) {
                System.out.println("Содержимое файла:");
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}