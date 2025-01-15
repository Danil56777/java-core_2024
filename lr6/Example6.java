package lr6;

import java.util.Arrays;

public class Example6 {

    public static int[] getSubArray(int[] array, int n) {
        if (n >= array.length) {
            return Arrays.copyOf(array, array.length);
        } else {
            return Arrays.copyOfRange(array, 0, n);
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] subArray1 = getSubArray(originalArray, 5);
        System.out.println("Подмассив с 5 элементами: " + Arrays.toString(subArray1));

        int[] subArray2 = getSubArray(originalArray, 12);
        System.out.println("Копия массива (больше, чем длина массива): " + Arrays.toString(subArray2));
    }
}
