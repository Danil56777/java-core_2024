package lr12;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10000) {
                System.out.println("Поток 1 - имя: " + Thread.currentThread().getName() +
                        ", время: " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10000) {
                System.out.println("Поток 2 - имя: " + Thread.currentThread().getName() +
                        ", время: " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Программа завершена");
    }
}