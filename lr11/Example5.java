package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        if (strings == null || substring == null) {
            return List.of();
        }

        return strings.stream()
                .filter(s -> s != null && s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "grape", "pineapple", "pear");
        String search = "apple";

        List<String> result = filterBySubstring(words, search);

        System.out.println("Исходный список: " + words);
        System.out.println("Подстрока для поиска: '" + search + "'");
        System.out.println("Результат: " + result);
    }
}
