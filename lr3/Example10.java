package lr3;

import java.util.Random;
import java.util.Arrays;

public class Example10 {
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

        // Сортировка массива в порядке убывания
        Arrays.sort(array); // Сортируем массив по возрастанию
        // Для сортировки в порядке убывания, меняем местами элементы
        int left = 0, right = size - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        // Вывод отсортированного массива
        System.out.println("\nМассив после сортировки по убыванию:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
