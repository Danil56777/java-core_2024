package lr8.Task3;

import java.io.*;
import java.util.*;

public class Example1 {

    public static void main(String[] args) {
        String inputFilePath = "lr8/Task3/input.txt";
        String outputFilePath = "lr8/Task3/output.txt";

        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                writer.write("Вот север, тучи нагоняя,\n");
                writer.write("Дохнул, завыл — и вот сама\n");
                writer.write("Идет волшебница зима.\n");
                System.out.println("Файл input.txt создан и заполнен данными.");
            } catch (IOException e) {
                System.err.println("Ошибка при создании файла: " + e.getMessage());
                return;
            }
        }

        Set<Character> consonants = new HashSet<>(Arrays.asList(
                'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'Й', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'
        ));

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("[\\s\\p{Punct}]+");
                List<String> consonantWords = new ArrayList<>();

                for (String word : words) {
                    if (!word.isEmpty() && consonants.contains(word.charAt(0))) {
                        consonantWords.add(word);
                    }
                }

                if (!consonantWords.isEmpty()) {
                    writer.write("Строка " + lineNumber + ": ");
                    writer.write(String.join(" ", consonantWords));
                    writer.write(" (Количество слов: " + consonantWords.size() + ")");
                    writer.newLine();
                }
            }

            System.out.println("Обработка завершена. Результат записан в файл: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}