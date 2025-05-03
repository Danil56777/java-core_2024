package lr12;

public class Example3 {
    private static final Object lock = new Object();
    private static int number = 1;
    private static final int MAX_NUMBER = 10;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                while (number <= MAX_NUMBER) {
                    if (number % 2 == 0) {
                        System.out.println("Четное: " + number);
                        number++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            synchronized (lock) {
                while (number <= MAX_NUMBER) {
                    if (number % 2 != 0) {
                        System.out.println("Нечетное: " + number);
                        number++;
                        lock.notifyAll();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Программа завершена");
    }
}
