package lr9.Example2;

import java.util.Scanner;

public class Example2 {

    // Метод для перевода числа в двоичную систему с помощью рекурсии
    public static void toBinary(int number) {
        if (number == 0) return;
        toBinary(number / 2);
        System.out.print(number % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("0");
        } else {
            System.out.print("Двоичное представление: ");
            toBinary(number);
            System.out.println();
        }

        scanner.close();
    }
}
