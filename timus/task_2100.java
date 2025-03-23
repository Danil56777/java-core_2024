package timus;

import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int totalGuests = 2;

        for (int i = 0; i < n; i++) {
            String response = scanner.nextLine();
            if (response.endsWith("+one")) {
                totalGuests += 2;
            } else {
                totalGuests += 1;
            }
        }
        scanner.close();

        if (totalGuests == 13) {
            totalGuests++;
        }

        int cost = totalGuests * 100;
        System.out.println(cost);
    }
}

