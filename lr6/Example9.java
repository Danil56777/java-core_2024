package lr6;

import java.util.Arrays;

public class Example9 {

    public static void swapElements(char[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Исходный массив: " + Arrays.toString(charArray));

        swapElements(charArray);

        System.out.println("Измененный массив: " + Arrays.toString(charArray));
    }
}
