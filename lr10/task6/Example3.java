package lr10.task6;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Чтение XML-файла
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("lr10/task6/songs.xml"));

        // Выбор критерия поиска
        System.out.println("Выберите критерий поиска:");
        System.out.println("1. По исполнителю");
        System.out.println("2. По году выпуска");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        if (choice == 1) {
            System.out.println("Введите исполнителя:");
            String artist = scanner.nextLine();
            searchByArtist(doc, artist);
        } else if (choice == 2) {
            System.out.println("Введите год выпуска:");
            String year = scanner.nextLine();
            searchByYear(doc, year);
        } else {
            System.out.println("Неверный выбор.");
        }
    }

    private static void searchByArtist(Document doc, String artist) {
        NodeList songList = doc.getElementsByTagName("song");
        System.out.println("Песни исполнителя " + artist + ":");
        for (int i = 0; i < songList.getLength(); i++) {
            Element song = (Element) songList.item(i);
            String currentArtist = song.getElementsByTagName("artist").item(0).getTextContent();
            if (currentArtist.equalsIgnoreCase(artist)) {
                String title = song.getElementsByTagName("title").item(0).getTextContent();
                String year = song.getElementsByTagName("year").item(0).getTextContent();
                System.out.println("Название: " + title + ", Год: " + year);
            }
        }
    }

    private static void searchByYear(Document doc, String year) {
        NodeList songList = doc.getElementsByTagName("song");
        System.out.println("Песни, выпущенные в " + year + " году:");
        for (int i = 0; i < songList.getLength(); i++) {
            Element song = (Element) songList.item(i);
            String currentYear = song.getElementsByTagName("year").item(0).getTextContent();
            if (currentYear.equals(year)) {
                String title = song.getElementsByTagName("title").item(0).getTextContent();
                String artist = song.getElementsByTagName("artist").item(0).getTextContent();
                System.out.println("Название: " + title + ", Исполнитель: " + artist);
            }
        }
    }
}
