package lr4;

public class Example2 {
    public static void main(String[] args) {
        int height = 10; // высота треугольника (количество строк)

        // Внешний цикл: строки
        for (int i = 1; i <= height; i++) {
            // Внутренний цикл: символы в строке
            for (int j = 1; j <= i; j++) {
                System.out.print("+"); // вывод символа
            }
            System.out.println(); // переход на новую строку
        }
        System.out.println("Высота треугольника: " + height + " строк.");
    }
}

