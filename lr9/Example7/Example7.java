package lr9.Example7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example7 {
    public static void main(String[] args) {
        int N = 10000; // Количество человек для теста (можно изменить для других значений)

        // Моделирование с ArrayList
        ArrayList<Integer> arrayListPeople = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            arrayListPeople.add(i);
        }
        long arrayListTime = measureTime(() -> {
            int index = 0;
            while (arrayListPeople.size() > 1) {
                index = (index + 1) % arrayListPeople.size();
                arrayListPeople.remove(index);
            }
        });
        System.out.println("Оставшийся человек (ArrayList): " + arrayListPeople.get(0));
        System.out.println("Время для ArrayList: " + arrayListTime + " ms");

        // Моделирование с LinkedList
        LinkedList<Integer> linkedListPeople = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            linkedListPeople.add(i);
        }
        long linkedListTime = measureTime(() -> {
            int index = 0;
            while (linkedListPeople.size() > 1) {
                index = (index + 1) % linkedListPeople.size();
                linkedListPeople.remove(index);
            }
        });
        System.out.println("Оставшийся человек (LinkedList): " + linkedListPeople.get(0));
        System.out.println("Время для LinkedList: " + linkedListTime + " ms");

        // Сравнение
        System.out.println("\nLinkedList быстрее, так как операции удаления в середине списка выполняются за O(1) после доступа, тогда как в ArrayList требуется сдвиг элементов (O(n)).");
    }

    private static long measureTime(Runnable task) {
        long start = System.currentTimeMillis();
        task.run();
        return System.currentTimeMillis() - start;
    }
}