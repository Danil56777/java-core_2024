package lr4;

public class Example1 {
    public static void main(String[] args) {
        int width = 23; // ширина прямоугольника (количество колонок)
        int height = 11; // высота прямоугольника (количество строк)

        // Внешний цикл: строки
        for (int i = 1; i <= height; i++) {
            System.out.print("Номер строки: " + i + " "); // вывод номера строки
            // Вложенный цикл: символы в строке
            for (int j = 1; j <= width; j++) {
                System.out.print("+"); // вывод символов
            }
            System.out.println(); // переход на следующую строку
        }
        // Итоговое сообщение
        System.out.println("Размер прямоугольника: " + height + " строк, " + width + " колонок.");
    }
}

