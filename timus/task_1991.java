package timus;

import java.util.Scanner;

public class task_1991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int unusedBoomBooms = 0;
        int survivingDroids = 0;

        for (int i = 0; i < n; i++) {
            int boomBooms = scanner.nextInt();
            if (boomBooms > k) {
                unusedBoomBooms += (boomBooms - k);
            } else {
                survivingDroids += (k - boomBooms);
            }
        }

        scanner.close();
        System.out.println(unusedBoomBooms + " " + survivingDroids);
    }
}

