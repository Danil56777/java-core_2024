package timus;

import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;
        int start = Math.min(N, 1);
        int end = Math.max(N, 1);
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(sum);
        scanner.close();
    }
}