package lr4;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пользовательский алфавит
        String customAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя1234567890,.!? "; // Ваш собственный алфавит
        int alphabetLength = customAlphabet.length();

        // Ввод текста для шифрования
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        // Ввод ключа (сдвига)
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        // Шифруем текст
        String encryptedText = customCaesarCipher(text, key, customAlphabet);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Вопрос на обратное преобразование
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            char answer = scanner.next().charAt(0);

            if (answer == 'y' || answer == 'Y') {
                // Выполняем обратное преобразование
                String decryptedText = customCaesarCipher(encryptedText, -key, customAlphabet);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break; // Прерываем цикл
            } else if (answer == 'n' || answer == 'N') {
                // Закрываем программу
                System.out.println("До свидания!");
                break; // Прерываем цикл
            } else {
                // Если введен некорректный ответ
                System.out.println("Введите корректный ответ");
            }
        }

        scanner.close();
    }

    // Метод для шифрования и дешифрования текста с использованием пользовательского алфавита
    public static String customCaesarCipher(String text, int key, String customAlphabet) {
        StringBuilder result = new StringBuilder();
        int alphabetLength = customAlphabet.length();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int index = customAlphabet.indexOf(character);

            if (index != -1) {
                // Сдвиг с учетом цикличности алфавита
                int shiftedIndex = (index + key) % alphabetLength;
                if (shiftedIndex < 0) {
                    shiftedIndex += alphabetLength; // Для отрицательных индексов
                }
                result.append(customAlphabet.charAt(shiftedIndex));
            } else {
                // Если символ не найден в алфавите, добавляем его как есть
                result.append(character);
            }
        }

        return result.toString();
    }
}
