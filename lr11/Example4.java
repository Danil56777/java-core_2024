package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = squareNumbers(numbers);

        System.out.println("Исходные числа: " + numbers);
        System.out.println("Квадраты чисел: " + squaredNumbers);
    }
}
