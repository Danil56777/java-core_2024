package lr10.task4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        // Создание новой книги Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Создание нового листа в книге
        Sheet sheet = workbook.createSheet("Товары");

        // Записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Цена");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(580.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 8 ГБ");
        dataRow2.createCell(2).setCellValue(25080.0);

        // Записываем книгу Excel в файл
        String filePath = "lr10/task4/example.xlsx";
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        }

        workbook.close();
        System.out.println("Данные записаны в файл: " + filePath);
    }
}
