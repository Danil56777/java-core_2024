package timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();

        int remainingTasks = 12 - f;

        if (remainingTasks <= 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

