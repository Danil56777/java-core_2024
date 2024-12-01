package l1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2024;

        int age = currentYear - birthYear;

        String yearWord;
        if (age % 10 == 1 && age % 100 != 11) {
            yearWord = "год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) && !(age % 100 >= 12 && age % 100 <= 14)) {
            yearWord = "года";
        } else {
            yearWord = "лет";
        }

        System.out.println(name + " " + age + " " + yearWord + ".");

        scanner.close();
    }
}


