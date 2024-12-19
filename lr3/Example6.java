package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;

        // Обработка ошибок ввода размера массива
        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                size = Integer.parseInt(scanner.nextLine()); // Ввод размера массива
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным числом. Попробуйте еще раз.");
                } else {
                    break; // Ввод успешен, выходим из цикла
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое положительное число.");
            }
        }

        // Создаем массив с указанным размером
        int[] array = new int[size];

        // Заполнение массива числами, которые при делении на 5 дают остаток 2
        int number = 2; // Начальное число, которое при делении на 5 дает остаток 2
        for (int i = 0; i < size; i++) {
            array[i] = number;
            number += 5; // Следующее число, которое при делении на 5 даст остаток 2
        }

        // Вывод массива
        System.out.println("Заполненный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
