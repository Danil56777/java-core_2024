package timus;

import java.util.Arrays;
import java.util.Scanner;

public class task_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();

        int[] groups = new int[K];
        for (int i = 0; i < K; i++) {
            groups[i] = scanner.nextInt();
        }

        int result = minimalSupporters(K, groups);

        System.out.println(result);
    }

    public static int minimalSupporters(int K, int[] groups) {
        Arrays.sort(groups);

        int requiredGroups = (K / 2) + 1;

        int total = 0;
        for (int i = 0; i < requiredGroups; i++) {
            total += (groups[i] / 2) + 1;
        }

        return total;
    }
}
