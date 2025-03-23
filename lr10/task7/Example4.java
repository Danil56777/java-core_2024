package lr10.task7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Чтение JSON-файла
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("lr10/task7/songs.json"));

        // Ввод названия песни для удаления
        System.out.println("Введите название песни для удаления:");
        String title = scanner.nextLine();

        // Удаление песни
        deleteSong(jsonObject, title);

        // Запись изменений в файл
        try (FileWriter file = new FileWriter("lr10/task7/songs.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("Песня успешно удалена!");
        }
    }

    private static void deleteSong(JSONObject jsonObject, String title) {
        JSONArray songs = (JSONArray) jsonObject.get("songs");
        Iterator iterator = songs.iterator();
        while (iterator.hasNext()) {
            JSONObject song = (JSONObject) iterator.next();
            if (title.equalsIgnoreCase((String) song.get("title"))) {
                iterator.remove();
            }
        }
    }
}
