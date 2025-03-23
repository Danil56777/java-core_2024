package lr10.task1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class Example2 {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(new File("lr10/task1/1/library.xml"));

        Element root = doc.getDocumentElement();
        System.out.println("Корневой элемент: " + root.getNodeName());

        NodeList bookList = doc.getElementsByTagName("book");
        for (int i = 0; i < bookList.getLength(); i++) {
            Element book = (Element) bookList.item(i);
            String title = book.getElementsByTagName("title").item(0).getTextContent();
            String author = book.getElementsByTagName("author").item(0).getTextContent();
            String year = book.getElementsByTagName("year").item(0).getTextContent();
            System.out.println("Книга: " + title + ", Автор: " + author + ", Год: " + year);
        }
    }
}
