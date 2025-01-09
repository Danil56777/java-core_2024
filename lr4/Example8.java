package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста для шифрования
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        // Ввод ключа (сдвига)
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        // Шифруем текст
        String encryptedText = caesarCipher(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Вопрос на обратное преобразование
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            char answer = scanner.next().charAt(0);

            if (answer == 'y' || answer == 'Y') {
                // Выполняем обратное преобразование
                String decryptedText = caesarCipher(encryptedText, -key);
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

    // Метод для шифрования и дешифрования текста с помощью шифра Цезаря
    public static String caesarCipher(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            // Если символ является буквой
            if (Character.isLetter(character)) {
                char base = (Character.isLowerCase(character)) ? 'a' : 'A';
                char shiftedChar = (char) (base + (character - base + key) % 26);
                result.append(shiftedChar);
            } else {
                // Если символ не является буквой, просто добавляем его в результат
                result.append(character);
            }
        }

        return result.toString();
    }
}

