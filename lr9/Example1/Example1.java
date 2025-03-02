package lr9.Example1;

public class Example1 {

    public static void sequence(int x) {
        if (x >= 20) return;
        System.out.println(x);
        sequence(2 * x + 1);
    }

    public static void reverseSequence(int x) {
        if (x >= 20) return;
        reverseSequence(2 * x + 1);
        System.out.println(x);
    }

    public static void printBeforeAfter(int x) {
        if (x >= 20) return;
        System.out.println("Перед вызовом: " + x);
        printBeforeAfter(2 * x + 1);
        System.out.println("После вызова: " + x);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n, int depth) {
        System.out.println(" ".repeat(depth * 2) + "fib(" + n + ") вызван");
        if (n == 0) return 0;
        if (n == 1) return 1;
        int result = fibonacci(n - 1, depth + 1) + fibonacci(n - 2, depth + 1);
        System.out.println(" ".repeat(depth * 2) + "fib(" + n + ") = " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Пример 1: Последовательность");
        sequence(1);

        System.out.println("\nПример 2: Последовательность в обратном порядке");
        reverseSequence(1);

        System.out.println("\nПример 3: Перед и после рекурсии");
        printBeforeAfter(1);

        System.out.println("\nПример 4: Факториал 5! = " + factorial(5));

        System.out.println("\nПример 5: Число Фибоначчи (n=7) и обход дерева вызовов:");
        fibonacci(7, 0);
    }
}
