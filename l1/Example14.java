package l1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = scanner.nextInt();

        int numMinusOne = num - 1;
        int numPlusOne = num + 1;
        int sum = numMinusOne + num + numPlusOne;
        int fourthNumber = sum * sum;

        System.out.println("Число на единицу меньше: " + numMinusOne);
        System.out.println("Введенное число: " + num);
        System.out.println("Число на единицу больше: " + numPlusOne);
        System.out.println("Четвертое число (квадрат суммы): " + fourthNumber);

        scanner.close();
    }
}

