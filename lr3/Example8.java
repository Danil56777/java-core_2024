package lr3;

public class Example8 {
    public static void main(String[] args) {
        char[] array = new char[10];  // Массив для хранения 10 букв
        char currentLetter = 'A';      // Начинаем с буквы 'A'
        int index = 0;                 // Индекс для заполнения массива

        // Заполнение массива согласными буквами
        while (index < array.length) {
            if (isConsonant(currentLetter)) {  // Проверяем, является ли буква согласной
                array[index] = currentLetter;  // Записываем букву в массив
                index++;  // Переходим к следующему элементу массива
            }
            currentLetter++;  // Переходим к следующей букве
        }

        // Вывод массива на экран
        System.out.println("Содержимое массива:");
        for (char letter : array) {
            System.out.print(letter + " ");
        }
    }

    // Метод для проверки, является ли буква согласной
    public static boolean isConsonant(char letter) {
        // Пропускаем гласные буквы
        return letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U';
    }
}

