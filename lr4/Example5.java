package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        // Размер исходного массива (например, 3 строки и 5 столбцов)
        int rows = 3;
        int cols = 5;

        // Создание двумерного массива с размерами rows x cols
        int[][] originalArray = new int[rows][cols];
        Random rand = new Random();

        // Заполнение массива случайными числами от 0 до 99
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = rand.nextInt(100); // Случайные числа от 0 до 99
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }

        // Транспонирование массива: меняем строки и столбцы местами
        int[][] transposedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        // Вывод транспонированного массива
        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[i].length; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

