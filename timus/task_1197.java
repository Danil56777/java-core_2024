package timus;

import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < n; i++) {
            String position = scanner.nextLine();
            int col = position.charAt(0) - 'a' + 1;
            int row = position.charAt(1) - '0';

            int validMoves = 0;
            for (int j = 0; j < 8; j++) {
                int newCol = col + dx[j];
                int newRow = row + dy[j];

                if (newCol >= 1 && newCol <= 8 && newRow >= 1 && newRow <= 8) {
                    validMoves++;
                }
            }

            System.out.println(validMoves);
        }

        scanner.close();
    }
}

