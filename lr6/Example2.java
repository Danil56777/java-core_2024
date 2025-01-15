package lr6;

public class Example2 {
    private static int count = 0;

    public static void displayAndIncrement() {
        System.out.println("Текущее значение: " + count);
        count++;
    }

    public static void main(String[] args) {
        displayAndIncrement();  // 0
        displayAndIncrement();  // 1
        displayAndIncrement();  // 2
        displayAndIncrement();  // 3
    }
}

