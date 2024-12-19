package lr3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine().trim().toLowerCase();

        // Вложенные условные операторы
        if (dayName.equals("понедельник")) {
            System.out.println("Порядковый номер дня: 1");
        } else if (dayName.equals("вторник")) {
            System.out.println("Порядковый номер дня: 2");
        } else if (dayName.equals("среда")) {
            System.out.println("Порядковый номер дня: 3");
        } else if (dayName.equals("четверг")) {
            System.out.println("Порядковый номер дня: 4");
        } else if (dayName.equals("пятница")) {
            System.out.println("Порядковый номер дня: 5");
        } else if (dayName.equals("суббота")) {
            System.out.println("Порядковый номер дня: 6");
        } else if (dayName.equals("воскресенье")) {
            System.out.println("Порядковый номер дня: 7");
        } else {
            System.out.println("Такого дня нет.");
        }

        // Использование оператора выбора switch
        System.out.print("Введите название дня недели ещё раз: ");
        dayName = scanner.nextLine().trim().toLowerCase();

        switch (dayName) {
            case "понедельник":
                System.out.println("Порядковый номер дня: 1");
                break;
            case "вторник":
                System.out.println("Порядковый номер дня: 2");
                break;
            case "среда":
                System.out.println("Порядковый номер дня: 3");
                break;
            case "четверг":
                System.out.println("Порядковый номер дня: 4");
                break;
            case "пятница":
                System.out.println("Порядковый номер дня: 5");
                break;
            case "суббота":
                System.out.println("Порядковый номер дня: 6");
                break;
            case "воскресенье":
                System.out.println("Порядковый номер дня: 7");
                break;
            default:
                System.out.println("Такого дня нет.");
        }

        scanner.close();
    }
}

