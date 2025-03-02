package lr9.Example9;

import java.util.*;

public class Example9 {

    public static void main(String[] args) {
        // Создаем коллекции
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Количество элементов для тестирования
        int n = 100000;

        // Измеряем время выполнения операций
        System.out.println("Время добавления в HashSet: " + getAddTime(hashSet, n) + " мс");
        System.out.println("Время добавления в LinkedHashMap: " + getAddTimeMap(linkedHashMap, n) + " мс");
        System.out.println("Время добавления в ArrayList: " + getAddTime(arrayList, n) + " мс");

        System.out.println("Время удаления из HashSet: " + getRemoveTime(hashSet, n) + " мс");
        System.out.println("Время удаления из LinkedHashMap: " + getRemoveTimeMap(linkedHashMap, n) + " мс");
        System.out.println("Время удаления из ArrayList: " + getRemoveTime(arrayList, n) + " мс");

        System.out.println("Время получения элемента из ArrayList: " + getGetTime(arrayList, n) + " мс");
        System.out.println("Время получения элемента из LinkedHashMap: " + getGetTimeMap(linkedHashMap, n) + " мс");
    }

    // Метод для измерения времени добавления элементов в коллекцию
    private static long getAddTime(Collection<Integer> collection, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            collection.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени добавления элементов в Map
    private static long getAddTimeMap(Map<Integer, String> map, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            map.put(i, "value" + i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени удаления элементов из коллекции
    private static long getRemoveTime(Collection<Integer> collection, int n) {
        // Заполняем коллекцию
        for (int i = 0; i < n; i++) {
            collection.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            collection.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени удаления элементов из Map
    private static long getRemoveTimeMap(Map<Integer, String> map, int n) {
        // Заполняем коллекцию
        for (int i = 0; i < n; i++) {
            map.put(i, "value" + i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            map.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени получения элементов из List
    private static long getGetTime(List<Integer> list, int n) {
        // Заполняем коллекцию
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    // Метод для измерения времени получения элементов из Map
    private static long getGetTimeMap(Map<Integer, String> map, int n) {
        // Заполняем коллекцию
        for (int i = 0; i < n; i++) {
            map.put(i, "value" + i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            map.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}