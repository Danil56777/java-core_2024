package lr11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

    public static List<String> filterStringsStartingWithCapital(List<String> strings) {
        if (strings == null) {
            return List.of();
        }

        return strings.stream()
                .filter(s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Java", "python", "C++", "JavaScript", "", null, "Ruby");
        List<String> result = filterStringsStartingWithCapital(input);

        System.out.println("Исходный список: " + input);
        System.out.println("Строки с заглавной буквы: " + result);
    }
}
