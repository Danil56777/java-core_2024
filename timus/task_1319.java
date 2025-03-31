package timus;

import java.util.Scanner;

public class task_1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[][] matrix = new int[N][N];
        int num = 1;

        for (int startCol = N - 1; startCol >= 0; startCol--) {
            int i = 0, j = startCol;
            while (j < N) {
                matrix[i][j] = num++;
                i++;
                j++;
            }
        }

        for (int startRow = 1; startRow < N; startRow++) {
            int i = startRow, j = 0;
            while (i < N) {
                matrix[i][j] = num++;
                i++;
                j++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


