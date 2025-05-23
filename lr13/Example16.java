package lr13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Example16 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите номер столбца: ");
            int column = scanner.nextInt();

            if (column < 0 || column >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Столбец " + column + " не существует");
            }

            System.out.println("Столбец " + column + ":");
            for (int[] row : matrix) {
                System.out.println(row[column]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
