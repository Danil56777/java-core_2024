package timus;

import java.util.Scanner;

public class task_1493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.next();
        scanner.close();

        System.out.println(isOneStepFromHappiness(ticket) ? "Yes" : "No");
    }

    public static boolean isOneStepFromHappiness(String ticket) {
        int number = Integer.parseInt(ticket);
        return isLucky(number - 1) || isLucky(number + 1);
    }

    public static boolean isLucky(int number) {
        String ticket = String.format("%06d", number);
        int sum1 = ticket.charAt(0) - '0' + ticket.charAt(1) - '0' + ticket.charAt(2) - '0';
        int sum2 = ticket.charAt(3) - '0' + ticket.charAt(4) - '0' + ticket.charAt(5) - '0';
        return sum1 == sum2;
    }
}


