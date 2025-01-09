package lr4;

public class Example7 {
    public static void main(String[] args) {
        int rows = 5; // Количество строк
        int cols = 5; // Количество столбцов
        int[][] array = new int[rows][cols];
        int value = 1; // Начальное значение

        int left = 0, top = 0, right = cols - 1, bottom = rows - 1;

        while (value <= rows * cols) {
            // Заполнение сверху слева направо
            for (int i = left; i <= right && value <= rows * cols; i++) {
                array[top][i] = value++;
            }
            top++;

            // Заполнение справа сверху вниз
            for (int i = top; i <= bottom && value <= rows * cols; i++) {
                array[i][right] = value++;
            }
            right--;

            // Заполнение снизу справа налево
            for (int i = right; i >= left && value <= rows * cols; i--) {
                array[bottom][i] = value++;
            }
            bottom--;

            // Заполнение слева снизу вверх
            for (int i = bottom; i >= top && value <= rows * cols; i--) {
                array[i][left] = value++;
            }
            left++;
        }

        // Печать массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}


