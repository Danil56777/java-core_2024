package lr8.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        String inputFilePath = "lr8/Task2/input.txt";
        String outputFilePath = "lr8/Task2/output.txt";

        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                writer.write("Первая строка\n");
                writer.write("Вторая строка\n");
                writer.write("3.14\n");
                writer.write("-2.71\n");
                writer.write("0.0\n");
                writer.write("42.0\n");
                writer.write("-1.0\n");
                System.out.println("Файл input.txt создан и заполнен данными.");
            } catch (IOException e) {
                System.err.println("Ошибка при создании файла: " + e.getMessage());
                return;
            }
        }

        List<String> lines = new ArrayList<>();
        List<Double> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            lines.add(reader.readLine());
            lines.add(reader.readLine());

            for (int i = 0; i < 5; i++) {
                String line = reader.readLine();
                if (line != null) {
                    numbers.add(Double.parseDouble(line));
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.err.println("Ошибка при преобразовании числа: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            if (lines.size() > 1) {
                writer.write(lines.get(1));
                writer.newLine();
            }

            for (Double number : numbers) {
                if (number > 0) {
                    writer.write(number.toString());
                    writer.newLine();
                }
            }
            System.out.println("Данные успешно записаны в файл: " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}