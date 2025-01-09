package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        // Размеры исходного массива
        int rows = 5;
        int cols = 6;

        // Создание и инициализация исходного двумерного массива
        int[][] originalArray = new int[rows][cols];
        Random rand = new Random();

        // Заполнение массива случайными числами
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = rand.nextInt(100); // Случайные числа от 0 до 99
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }

        // Генерация случайных индексов для удаления строки и столбца
        int rowToDelete = rand.nextInt(rows); // Случайный индекс строки для удаления
        int colToDelete = rand.nextInt(cols); // Случайный индекс столбца для удаления

        System.out.println("\nУдаляемая строка: " + rowToDelete);
        System.out.println("Удаляемый столбец: " + colToDelete);

        // Создание нового массива размером на 1 строку и 1 столбец меньше
        int[][] newArray = new int[rows - 1][cols - 1];

        // Копирование данных в новый массив с удалением строки и столбца
        int newRow = 0;
        for (int i = 0; i < rows; i++) {
            if (i == rowToDelete) continue; // Пропускаем удаляемую строку
            int newCol = 0;
            for (int j = 0; j < cols; j++) {
                if (j == colToDelete) continue; // Пропускаем удаляемый столбец
                newArray[newRow][newCol] = originalArray[i][j];
                newCol++;
            }
            newRow++;
        }

        // Вывод нового массива после удаления строки и столбца
        System.out.println("\nНовый массив после удаления строки и столбца:");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

