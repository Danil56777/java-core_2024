package l1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.println("Введите название текущего месяца: ");
        String month = scanner.nextLine();

        System.out.println("Введите номер текущего дня месяца: ");
        int dayOfMonth = scanner.nextInt();

        System.out.println("Сегодня: " + dayOfWeek + ", " + dayOfMonth + " " + month);

        scanner.close();
    }
}

