package project1;

import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 5 == 2 && number % 7 == 1) {
                System.out.println("Число " + number + " удовлетворяет условиям.");
            } else {
                System.out.println("Число " + number + " не удовлетворяет условиям.");
            }
        } else {
            System.out.println("Ошибка: введено не число.");
        }

        scanner.close();
    }
}


