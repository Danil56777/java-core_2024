package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {

    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int threshold) {
        if (numbers == null) {
            return new ArrayList<>();
        }

        return numbers.stream()
                .filter(n -> n != null && n > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, null));
        int threshold = 20;

        List<Integer> result = filterNumbersGreaterThan(numbers, threshold);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Пороговое значение: " + threshold);
        System.out.println("Числа больше порога: " + result);
    }
}
