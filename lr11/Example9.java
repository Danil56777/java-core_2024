package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {

    public static List<String> filterLettersOnly(List<String> strings) {
        if (strings == null) {
            return new ArrayList<>();
        }

        return strings.stream()
                .filter(s -> s != null && s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Arrays.asList("Hello", "Java8", "World!", "123", "", "OnlyLetters", null));

        List<String> result = filterLettersOnly(input);

        System.out.println("Исходный список: " + input);
        System.out.println("Строки только с буквами: " + result);
    }
}
