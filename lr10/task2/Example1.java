package lr10.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;

public class Example1 {
    public static void main(String[] args) throws Exception {
        // Создаем JSON-объект
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        // Создаем первую книгу
        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", "1869");
        books.add(book1);

        // Создаем вторую книгу
        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");
        book2.put("year", "1967");
        books.add(book2);

        // Добавляем массив книг в объект библиотеки
        library.put("books", books);

        // Записываем JSON в файл
        try (FileWriter file = new FileWriter("lr10/task2/library.json")) {
            file.write(library.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        }
    }
}
