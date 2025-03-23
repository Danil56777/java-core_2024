package lr10.task6;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Чтение XML-файла
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("lr10/task6/songs.xml"));

        // Ввод данных о новой песне
        System.out.println("Введите название песни:");
        String title = scanner.nextLine();
        System.out.println("Введите исполнителя:");
        String artist = scanner.nextLine();
        System.out.println("Введите год выпуска:");
        String year = scanner.nextLine();

        // Добавление новой песни
        addSong(doc, title, artist, year);

        // Запись изменений в файл
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("lr10/task6/songs.xml"));
        transformer.transform(source, result);

        System.out.println("Песня успешно добавлена!");
    }

    private static void addSong(Document doc, String title, String artist, String year) {
        Element root = doc.getDocumentElement();

        // Создаем элемент <song>
        Element song = doc.createElement("song");

        // Создаем элемент <title>
        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));
        song.appendChild(titleElement);

        // Создаем элемент <artist>
        Element artistElement = doc.createElement("artist");
        artistElement.appendChild(doc.createTextNode(artist));
        song.appendChild(artistElement);

        // Создаем элемент <year>
        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(year));
        song.appendChild(yearElement);

        // Добавляем <song> в корневой элемент
        root.appendChild(song);
    }
}
