package lr10.task7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Чтение JSON-файла
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("lr10/task7/songs.json"));

        // Ввод исполнителя для поиска
        System.out.println("Введите исполнителя:");
        String artist = scanner.nextLine();

        // Поиск песен по исполнителю
        searchByArtist(jsonObject, artist);
    }

    private static void searchByArtist(JSONObject jsonObject, String artist) {
        JSONArray songs = (JSONArray) jsonObject.get("songs");
        System.out.println("Песни исполнителя " + artist + ":");
        for (Object obj : songs) {
            JSONObject song = (JSONObject) obj;
            String currentArtist = (String) song.get("artist");
            if (currentArtist.equalsIgnoreCase(artist)) {
                String title = (String) song.get("title");
                String year = (String) song.get("year");
                System.out.println("Название: " + title + ", Год: " + year);
            }
        }
    }
}
