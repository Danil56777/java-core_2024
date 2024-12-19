package timus;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt();
        int l = sc.nextInt();

        int N = g + l - 1;

        int notShotByHarry = N - g;

        int notShotByLarry = N - l;

        System.out.println(notShotByHarry + " " + notShotByLarry);

        sc.close();
    }
}

