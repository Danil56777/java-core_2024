package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {

    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }

        if (numbers == null) {
            return new ArrayList<>();
        }

        return numbers.stream()
                .filter(n -> n != null && n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, null));
        int divisor = 5;

        List<Integer> result = filterDivisibleNumbers(numbers, divisor);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Делитель: " + divisor);
        System.out.println("Числа, делящиеся без остатка: " + result);
    }
}
