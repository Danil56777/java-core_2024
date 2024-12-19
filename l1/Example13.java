package l1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Сумма двух чисел: " + sum);

        scanner.close();
    }
}

