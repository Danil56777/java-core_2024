package timus;

import java.util.Scanner;

public class task_1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = minimalTime(N, K);

        System.out.println(result);
    }

    public static int minimalTime(int N, int K) {
        int tExp = 0;
        int computers = 1;
        while (computers < K + 1 && computers < N) {
            computers *= 2;
            tExp++;
        }

        if (computers >= N) {
            return tExp;
        } else {
            int remainingComputers = N - computers;
            int tLinear = (remainingComputers + K - 1) / K;
            return tExp + tLinear;
        }
    }
}
