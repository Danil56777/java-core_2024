package timus;

import java.util.Scanner;

public class task_1327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int countOdd = countOddUpTo(B) - countOddUpTo(A - 1);
        System.out.println(countOdd);
    }

    static int countOddUpTo(int x) {
        if (x < 1) return 0;
        return (x + 1) / 2;
    }
}

