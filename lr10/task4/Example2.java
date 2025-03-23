package lr10.task4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        // Открываем файл Excel
        try (FileInputStream file = new FileInputStream("lr10/task4/example.xlsx")) {
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);

            // Читаем данные из файла
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            // Закрываем книгу
            workbook.close();
        }
    }
}
