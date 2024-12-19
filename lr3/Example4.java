package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        // Определяем наименьшее и наибольшее число
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // Используем цикл for
        System.out.println("Цикл for:");
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        // Используем цикл while
        System.out.println("\nЦикл while:");
        int i = start;
        while (i <= end) {
            System.out.println(i);
            i++;
        }

        // Используем цикл do-while
        System.out.println("\nЦикл do-while:");
        i = start;
        do {
            System.out.println(i);
            i++;
        } while (i <= end);

        // Используем цикл for-each (с коллекцией)
        System.out.println("\nЦикл for-each:");
        int[] numbers = new int[end - start + 1];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = start + j;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

