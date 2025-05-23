package lr13;

public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException("Исключение в методе m()");
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(m());
        } catch (RuntimeException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}
