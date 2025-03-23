package lr10.task6;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Чтение XML-файла
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("lr10/task6/songs.xml"));

        // Ввод названия песни для удаления
        System.out.println("Введите название песни для удаления:");
        String title = scanner.nextLine();

        // Удаление песни
        deleteSong(doc, title);

        // Запись изменений в файл
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("lr10/task6/songs.xml"));
        transformer.transform(source, result);

        System.out.println("Песня успешно удалена!");
    }

    private static void deleteSong(Document doc, String title) {
        NodeList songList = doc.getElementsByTagName("song");
        for (int i = 0; i < songList.getLength(); i++) {
            Element song = (Element) songList.item(i);
            String currentTitle = song.getElementsByTagName("title").item(0).getTextContent();
            if (currentTitle.equalsIgnoreCase(title)) {
                Node parent = song.getParentNode();
                parent.removeChild(song);
                break;
            }
        }
    }
}
