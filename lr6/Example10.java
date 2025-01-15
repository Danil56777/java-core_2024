package lr6;

import java.util.Arrays;

public class Example10 {

    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            return new int[] {0, 0};
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[] {min, max};
    }

    public static void main(String[] args) {
        int[] result = findMinMax(7, 3, 9, 2, 5, 8);

        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Максимальное значение: " + result[1]);
    }
}
