package lr10.task7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        // Создаем JSON-объект для песен
        JSONObject jsonObject = new JSONObject();
        JSONArray songs = new JSONArray();

        // Добавляем первую песню
        JSONObject song1 = new JSONObject();
        song1.put("title", "Number One");
        song1.put("artist", "4K");
        song1.put("year", "2020");
        songs.add(song1);

        // Добавляем вторую песню
        JSONObject song2 = new JSONObject();
        song2.put("title", "Москва");
        song2.put("artist", "Баста");
        song2.put("year", "2010");
        songs.add(song2);

        // Добавляем третью песню
        JSONObject song3 = new JSONObject();
        song3.put("title", "Шлюза за дым");
        song3.put("artist", "Местный");
        song3.put("year", "2013");
        songs.add(song3);

        // Добавляем массив песен в JSON-объект
        jsonObject.put("songs", songs);

        // Записываем JSON в файл
        try (FileWriter file = new FileWriter("lr10/task7/songs.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
