package timus;

import java.util.Scanner;

public class task_2066 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (b==0 || b == 1 || c == 1){
            System.out.println(a - b -c);
        } else {
            System.out.println(a - b * c);
        }
    }
}
