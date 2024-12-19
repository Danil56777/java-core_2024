package lr3;

public class Example7 {
    public static void main(String[] args) {
        int size = 10; // Размер массива
        char[] array = new char[size];

        // Заполнение массива буквами "через одну", начиная с 'а'
        char letter = 'a';
        for (int i = 0; i < size; i++) {
            array[i] = letter;
            letter += 2; // Переход к следующей букве через одну
        }

        // Вывод массива в прямом порядке
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Вывод массива в обратном порядке
        System.out.println("\nМассив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

