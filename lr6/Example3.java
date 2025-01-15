package lr6;

public class Example3 {

    public static int findMax(int... numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Максимальное значение: " + findMax(numbers));  // 50
        System.out.println("Минимальное значение: " + findMin(numbers));   // 10
        System.out.println("Среднее значение: " + findAverage(numbers));   // 30.0

        System.out.println("Максимальное значение: " + findMax(10, 20, 30, 40, 50));  // 50
        System.out.println("Минимальное значение: " + findMin(10, 20, 30, 40, 50));   // 10
        System.out.println("Среднее значение: " + findAverage(10, 20, 30, 40, 50));   // 30.0
    }
}
