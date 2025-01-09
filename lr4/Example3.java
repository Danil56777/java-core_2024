package lr4;

public class Example3 {
    public static void main(String[] args) {
        int rows = 5; // количество строк в прямоугольнике
        int columns = 10; // количество колонок в прямоугольнике

        // Создаем двумерный массив
        int[][] rectangle = new int[rows][columns];

        // Заполняем массив цифрой 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rectangle[i][j] = 2; // каждую ячейку заполняем цифрой 2
            }
        }

        // Выводим прямоугольник на консоль
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(rectangle[i][j] + " "); // выводим элементы массива
            }
            System.out.println(); // переход на новую строку
        }
    }
}

