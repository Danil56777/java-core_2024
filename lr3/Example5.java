package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        // Сумма с использованием цикла for
        int sumFor = 0;
        int matchedNumbersFor = 0;
        for (int number = 1; matchedNumbersFor < count; number++) {
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.println("Число (for): " + number);
                sumFor += number;
                matchedNumbersFor++;
            }
        }
        System.out.println("Сумма (for): " + sumFor);

        // Сумма с использованием цикла while
        int sumWhile = 0;
        int numberWhile = 1;
        int matchedNumbersWhile = 0;
        while (matchedNumbersWhile < count) {
            if (numberWhile % 5 == 2 || numberWhile % 3 == 1) {
                System.out.println("Число (while): " + numberWhile);
                sumWhile += numberWhile;
                matchedNumbersWhile++;
            }
            numberWhile++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        // Сумма с использованием цикла do-while
        int sumDoWhile = 0;
        int numberDoWhile = 1;
        int matchedNumbersDoWhile = 0;
        do {
            if (numberDoWhile % 5 == 2 || numberDoWhile % 3 == 1) {
                System.out.println("Число (do-while): " + numberDoWhile);
                sumDoWhile += numberDoWhile;
                matchedNumbersDoWhile++;
            }
            numberDoWhile++;
        } while (matchedNumbersDoWhile < count);
        System.out.println("Сумма (do-while): " + sumDoWhile);
    }
}
