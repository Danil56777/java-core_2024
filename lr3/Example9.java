package lr3;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();

        // Размер массива
        int size = 10;
        int[] array = new int[size];

        // Заполнение массива случайными числами
        System.out.println("Массив случайных чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Случайные числа от 0 до 99
            System.out.print(array[i] + " ");
        }

        // Ищем минимальное значение и его индексы
        int minValue = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        // Вывод минимального значения
        System.out.println("\nМинимальное значение: " + minValue);

        // Вывод индексов элементов с минимальным значением
        System.out.println("Индексы элементов с минимальным значением:");
        for (int i = 0; i < size; i++) {
            if (array[i] == minValue) {
                System.out.print(i + " ");
            }
        }
    }
}

