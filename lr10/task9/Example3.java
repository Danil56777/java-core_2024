package lr10.task9;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            System.out.println("Введите путь к Excel-файлу:");
            String filePath = scanner.nextLine();
            System.out.println("Введите название листа:");
            String sheetName = scanner.nextLine();

            try (FileInputStream file = new FileInputStream(new File(filePath))) {
                // Открываем книгу Excel
                Workbook workbook = new XSSFWorkbook(file);

                // Получаем лист по имени
                Sheet sheet = workbook.getSheet(sheetName);
                if (sheet == null) {
                    System.err.println("Ошибка: Лист с именем '" + sheetName + "' не найден.");
                    System.out.println("Доступные листы:");
                    for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                        System.out.println(workbook.getSheetName(i));
                    }
                    continue; // Повторный запрос данных
                }

                // Читаем данные из листа
                System.out.println("Данные из листа '" + sheetName + "':");
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                // Закрываем книгу
                workbook.close();
                retry = false; // Успешное завершение, выходим из цикла
            } catch (IOException e) {
                System.err.println("Ошибка: Не удалось прочитать файл. Убедитесь, что файл существует и имеет правильный формат.");
                System.err.println("Подробности: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Ошибка: " + e.getMessage());
            }

            if (retry) {
                System.out.println("Хотите повторить попытку? (да/нет)");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("да")) {
                    retry = false;
                }
            }
        }

        scanner.close();
    }
}
