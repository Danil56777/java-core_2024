package lr10.task7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Чтение JSON-файла
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("lr10/task7/songs.json"));

        // Ввод данных о новой песне
        System.out.println("Введите название песни:");
        String title = scanner.nextLine();
        System.out.println("Введите исполнителя:");
        String artist = scanner.nextLine();
        System.out.println("Введите год выпуска:");
        String year = scanner.nextLine();

        // Добавление новой песни
        addSong(jsonObject, title, artist, year);

        // Запись изменений в файл
        try (FileWriter file = new FileWriter("lr10/task7/songs.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("Песня успешно добавлена!");
        }
    }

    private static void addSong(JSONObject jsonObject, String title, String artist, String year) {
        JSONArray songs = (JSONArray) jsonObject.get("songs");
        JSONObject newSong = new JSONObject();
        newSong.put("title", title);
        newSong.put("artist", artist);
        newSong.put("year", year);
        songs.add(newSong);
    }
}
