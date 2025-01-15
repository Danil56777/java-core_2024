package lr6;

import java.util.Arrays;

public class Example7 {

    public static int[] getCharCodes(char[] charArray) {
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }

        return intArray;
    }

    public static void main(String[] args) {
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};

        int[] charCodes = getCharCodes(charArray);

        System.out.println("Коды символов: " + Arrays.toString(charCodes));
    }
}
