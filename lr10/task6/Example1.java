package lr10.task6;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Example1 {
    public static void main(String[] args) throws Exception {
        // Создаем фабрику и билдер для документа
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Создаем новый документ
        Document doc = builder.newDocument();

        // Создаем корневой элемент <songs>
        Element rootElement = doc.createElement("songs");
        doc.appendChild(rootElement);

        // Добавляем первую песню
        addSong(doc, rootElement, "Всяк Человек есть", "TRUEтень", "2024");
        // Добавляем вторую песню
        addSong(doc, rootElement, "Иордан", "MONA", "2025");
        // Добавляем третью песню
        addSong(doc, rootElement, "Alive", "Lil Jon", "2018");

        // Записываем документ в файл
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("lr10/task6/songs.xml"));
        transformer.transform(source, result);

        System.out.println("XML-файл успешно создан!");
    }

    private static void addSong(Document doc, Element root, String title, String artist, String year) {
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
