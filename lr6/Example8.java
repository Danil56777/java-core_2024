package lr6;

public class Example8 {

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        double average = calculateAverage(array);

        System.out.println("Среднее значение элементов массива: " + average);
    }
}
