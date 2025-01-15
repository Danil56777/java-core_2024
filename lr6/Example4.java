package lr6;

public class Example4 {

    public static int doubleFactorial(int n) {
        int result = 1;

        if (n <= 0) {
            return 0;
        }

        while (n > 0) {
            result *= n;
            n -= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("5!! = " + doubleFactorial(5));  // 5 * 3 * 1 = 15
        System.out.println("6!! = " + doubleFactorial(6));  // 6 * 4 * 2 = 48
        System.out.println("7!! = " + doubleFactorial(7));  // 7 * 5 * 3 * 1 = 105
        System.out.println("8!! = " + doubleFactorial(8));  // 8 * 6 * 4 * 2 = 384
    }
}
