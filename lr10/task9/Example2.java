package lr10.task9;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        String filePath = "lr10/task9/example.xlsx"; // Путь к Excel-файлу
        String sheetName = "Sheet1"; // Название листа

        try (FileInputStream file = new FileInputStream(new File(filePath))) {
            // Открываем книгу Excel
            Workbook workbook = new XSSFWorkbook(file);

            // Получаем лист по имени
            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.err.println("Лист с именем '" + sheetName + "' не найден.");
                return;
            }

            // Читаем данные из листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            // Закрываем книгу
            workbook.close();
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
