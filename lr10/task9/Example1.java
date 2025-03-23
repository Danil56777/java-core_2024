package lr10.task9;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        // Создаем новую книгу Excel
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        // Заполняем данные
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Year");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue(1);
        dataRow1.createCell(1).setCellValue("John");
        dataRow1.createCell(2).setCellValue(1990);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue(2);
        dataRow2.createCell(1).setCellValue("Jane");
        dataRow2.createCell(2).setCellValue(1995);

        // Записываем книгу в файл
        try (FileOutputStream fileOut = new FileOutputStream("lr10/task9/example.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Файл успешно создан!");
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }

        // Закрываем книгу
        try {
            workbook.close();
        } catch (IOException e) {
            System.err.println("Ошибка при закрытии книги: " + e.getMessage());
        }
    }
}