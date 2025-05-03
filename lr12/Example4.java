package lr12;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Поток номер: " + threadNumber);
            });
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Все потоки завершили работу");
    }
}
