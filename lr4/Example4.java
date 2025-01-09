package lr4;

public class Example4 {
    public static void main(String[] args) {
        int rows = 10; // Высота треугольника
        int cols = 10; // Максимальная ширина треугольника
        char[][] triangle = new char[rows][cols]; // Двумерный массив для треугольника

        // Заполнение массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '+'; // Заполняем символами "+"
            }
        }

        // Вывод треугольника
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Выводим символ "+" или пустое место
                if (triangle[i][j] == '+') {
                    System.out.print("+ ");
                } else {
                    System.out.print("  "); // Печатаем пробелы для пустых мест
                }
            }
            System.out.println(); // Переход на новую строку после каждой строки треугольника
        }
    }
}

