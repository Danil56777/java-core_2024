package lr11;

import java.util.Arrays;

public class Example1 {

    public static int[] filterEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = filterEvenNumbers(input);

        System.out.println("Исходный массив: " + Arrays.toString(input));
        System.out.println("Четные числа: " + Arrays.toString(result));
    }
}
