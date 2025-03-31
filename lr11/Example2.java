package lr11;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Example2 {

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> secondArraySet = new HashSet<>();
        for (int num : array2) {
            secondArraySet.add(num);
        }

        return Arrays.stream(array1)
                .filter(secondArraySet::contains)
                .distinct()
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 2, 3};
        int[] arr2 = {4, 5, 6, 7, 8, 5};

        int[] commonElements = findCommonElements(arr1, arr2);

        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));
        System.out.println("Общие элементы: " + Arrays.toString(commonElements));
    }
}
