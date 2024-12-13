package project1;

import java.util.Scanner;

public class lesson6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            number = Math.abs(number);

            if (number >= 1000) {
                int thousands = (number / 1000) % 10;
                System.out.println("Четвертая цифра справа (тысячи) в числе: " + thousands);
            } else {
                System.out.println("В числе нет тысяч.");
            }
        } else {
            System.out.println("Ошибка: введено не число.");
        }

        scanner.close();
    }
}

