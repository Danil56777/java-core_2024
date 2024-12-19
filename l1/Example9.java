package l1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int days = scanner.nextInt();

        System.out.println("Месяц " + month + " содержит " + days + " дней.");

        scanner.close();
    }
}

