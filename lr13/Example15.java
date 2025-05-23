package lr13;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int size = Integer.parseInt(scanner.nextLine());
            int[] array = new int[size];
            int sum = 0;
            int count = 0;

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Нет положительных элементов");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
