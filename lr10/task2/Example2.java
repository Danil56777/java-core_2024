package lr10.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Example2 {
    public static void main(String[] args) throws Exception {
        // Создаем парсер
        JSONParser parser = new JSONParser();

        // Читаем JSON-файл
        JSONObject library = (JSONObject) parser.parse(new FileReader("lr10/task2/library.json"));

        // Получаем массив книг
        JSONArray books = (JSONArray) library.get("books");

        // Выводим информацию о книгах
        for (Object obj : books) {
            JSONObject book = (JSONObject) obj;
            String title = (String) book.get("title");
            String author = (String) book.get("author");
            String year = (String) book.get("year");
            System.out.println("Книга: " + title + ", Автор: " + author + ", Год: " + year);
        }
    }
}
