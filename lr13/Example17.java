package lr13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Example17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }

            byte[] array = new byte[size];
            byte sum = 0;

            System.out.println("Введите элементы массива (от -128 до 127):");
            for (int i = 0; i < size; i++) {
                try {
                    int num = scanner.nextInt();
                    if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                        throw new IllegalArgumentException("Число " + num + " выходит за границы диапазона byte");
                    }
                    array[i] = (byte) num;
                    sum += array[i];
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Введена строка вместо числа. Элемент пропущен.");
                    scanner.next();
                }
            }

            System.out.println("Сумма элементов: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа (размер массива)");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
