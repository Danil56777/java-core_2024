package timus;

import java.util.Scanner;

public class task_2111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] d = new int[n];
        long totalCargo = 0;
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
            totalCargo += d[i];
        }

        long totalTax = 0;
        for (int i = 0; i < n; i++) {
            totalTax += d[i] * totalCargo;
        }

        System.out.println(totalTax);
    }
}




