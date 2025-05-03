package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества иероглифов
        int N = scanner.nextInt();
        scanner.nextLine(); // Переход на следующую строку

        // Чтение иероглифов
        ArrayList<String> hieroglyphs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            hieroglyphs.add(scanner.nextLine());
        }

        // Чтение введённой буквы
        char inputChar = scanner.nextLine().charAt(0);

        // Поиск и вывод подходящих иероглифов
        for (String glyph : hieroglyphs) {
            if (glyph.charAt(0) == inputChar) {
                System.out.println(glyph);
            }
        }
    }
}
