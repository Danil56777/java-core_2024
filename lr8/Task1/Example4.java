package lr8.Task1;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            // Создание файла для записи чисел
            File f1 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/My/numIsh.txt");
            f1.getParentFile().mkdirs();
            f1.createNewFile();

            // Scanner для ввода чисел с правильной локалью
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.ENGLISH);

            // Открываем PrintWriter для записи чисел в текстовом формате
            PrintWriter wr = new PrintWriter(new FileWriter(f1));

            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");

            for (int i = 0; i < count; i++) {
                if (sc.hasNextFloat()) {
                    wr.println(sc.nextFloat());  // Запись чисел в текстовом формате
                } else {
                    System.out.println("Ошибка: введено не число! Попробуйте снова.");
                    sc.next(); // Пропустить ошибочный ввод
                    i--; // Повторить ввод
                }
            }

            wr.flush();
            wr.close();

            // Создание второго файла для копирования данных
            File f2 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/My/numRez.txt");
            f2.createNewFile();

            // Читаем числа из первого файла и записываем во второй файл
            BufferedReader rd = new BufferedReader(new FileReader(f1));
            PrintWriter wr2 = new PrintWriter(new FileWriter(f2));

            String line;
            while ((line = rd.readLine()) != null) {
                wr2.println(line);
                System.out.println("Число: " + line);
            }

            rd.close();
            wr2.flush();
            wr2.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
