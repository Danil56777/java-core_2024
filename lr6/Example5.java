package lr6;

public class Example5 {

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int sumOfSquaresFormula(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] args) {
        int n = 5;

        int sumViaLoop = sumOfSquares(n);
        System.out.println("Сумма квадратов от 1 до " + n + " (через цикл): " + sumViaLoop);

        int sumViaFormula = sumOfSquaresFormula(n);
        System.out.println("Сумма квадратов от 1 до " + n + " (через формулу): " + sumViaFormula);

        if (sumViaLoop == sumViaFormula) {
            System.out.println("Результаты совпадают.");
        } else {
            System.out.println("Результаты не совпадают.");
        }
    }
}
