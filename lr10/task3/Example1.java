package lr10.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        // Подключаемся к странице
        Document doc = Jsoup.connect("https://itlearn.ru/first-steps").get();

        // Получаем все ссылки на странице
        Elements links = doc.select("a[href]");
        for (Element link : links) {
            System.out.println("Ссылка: " + link.attr("href"));
        }
    }
}
