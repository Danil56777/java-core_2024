package lr12;

public class Example2 {
    public static void main(String[] args) {
        Thread countThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        countThread.start();

        try {
            countThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток завершил работу");
    }
}
