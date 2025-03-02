package timus;

import java.util.Scanner;

public class task_1000 {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения входных данных
        Scanner scanner = new Scanner(System.in);

        // Чтение двух чисел
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Вычисление суммы
        int result = a + b;

        // Вывод результата
        System.out.println(result);
    }
}
