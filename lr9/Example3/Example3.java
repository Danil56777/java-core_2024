package lr9.Example3;

import java.util.Scanner;

public class Example3 {
    public static void inputArray(int[] arr, int index) {
        if (index == arr.length) return;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элемент [" + index + "]: ");
        arr[index] = scanner.nextInt();
        inputArray(arr, index + 1);
    }

    public static void outputArray(int[] arr, int index) {
        if (index == arr.length) {
            System.out.println();
            return;
        }
        System.out.print(arr[index] + " ");
        outputArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        inputArray(arr, 0);
        System.out.print("Массив: ");
        outputArray(arr, 0);
    }
}
