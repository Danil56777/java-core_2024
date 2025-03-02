package lr9.Example6;

import java.util.HashMap;

public class Example6 {

        public static void main(String[] args) {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "One");
            map.put(2, "Two");
            map.put(3, "Three");
            map.put(4, "Four");
            map.put(5, "Five");
            map.put(6, "Six");
            map.put(7, "Seven");
            map.put(8, "Eight");
            map.put(9, "Nine");
            map.put(0, "Zero");

            System.out.println("Строки с ключом > 5:");
            map.entrySet().stream()
                    .filter(entry -> entry.getKey() > 5)
                    .forEach(entry -> System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue()));

            if (map.containsKey(0)) {
                System.out.println("Строки с ключом 0: " + map.get(0));
            }

            int product = map.entrySet().stream()
                    .filter(entry -> entry.getValue().length() > 5)
                    .mapToInt(entry -> entry.getKey())
                    .reduce(1, (a, b) -> a * b);
            System.out.println("Произведение ключей, где длина строки > 5: " + product);
        }
    }
