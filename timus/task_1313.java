package timus;

import java.util.Scanner;

public class task_1313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int d = 0; d <= 2 * (N - 1); d++) {
            for (int r = Math.min(d, N - 1); r >= 0; r--) {
                int c = d - r;
                if (c >= 0 && c < N) {
                    System.out.print(matrix[r][c] + " ");
                }
            }
        }
    }
}
