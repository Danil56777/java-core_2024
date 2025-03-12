package timus;

import java.util.Scanner;

public class task_1349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        // Если n == 0, любое число в степени 0 равно 1, решений нет
        if (n == 0) {
            System.out.println(-1);
            return;
        }

        // Перебираем все возможные a, b, c в диапазоне [1, 100]
        for (int a = 1; a <= 100; a++) {
            for (int b = a + 1; b <= 100; b++) { // b > a для уникальности
                for (int c = b + 1; c <= 100; c++) { // c > b
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                        System.out.println(a + " " + b + " " + c);
                        return; // Найдено минимальное решение, выходим
                    }
                }
            }
        }

        // Если решения не найдено
        System.out.println(-1);
    }
}


