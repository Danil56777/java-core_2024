package l1;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем ввод первого числа
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Запрашиваем ввод второго числа
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Вычисляем сумму и разность
        int sum = num1 + num2;
        int difference = num1 - num2;

        // Выводим результаты
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + difference);

        // Закрываем сканер
        scanner.close();
    }
}

