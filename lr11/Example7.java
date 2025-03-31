package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        if (strings == null || minLength < 0) {
            return new ArrayList<>();
        }

        return strings.stream()
                .filter(s -> s != null && s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Arrays.asList("Java", "Python", "C", "JavaScript", "", "Kotlin", null));
        int minLength = 3;

        List<String> result = filterStringsByLength(input, minLength);

        System.out.println("Исходный список: " + input);
        System.out.println("Минимальная длина: " + minLength);
        System.out.println("Результат фильтрации: " + result);
    }
}
