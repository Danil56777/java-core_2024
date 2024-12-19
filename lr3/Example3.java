package lr3;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Количество чисел должно быть больше 0.");
        } else {
            System.out.println("Последовательность Фибоначчи (цикл for):");
            int a = 1, b = 1;
            System.out.print(a + " " + b);
            for (int i = 3; i <= count; i++) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
            System.out.println();

            System.out.println("Последовательность Фибоначчи (цикл while):");
            a = 1;
            b = 1;
            int i = 3;
            System.out.print(a + " " + b);
            while (i <= count) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
                i++;
            }
            System.out.println();

            System.out.println("Последовательность Фибоначчи (цикл do-while):");
            a = 1;
            b = 1;
            i = 3;
            System.out.print(a + " " + b);
            do {
                if (i > count) break;
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
                i++;
            } while (i <= count);
            System.out.println();
        }

        scanner.close();
    }
}