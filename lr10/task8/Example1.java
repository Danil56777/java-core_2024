package lr10.task8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Example1 {
    private static final String URL = "https://lenta.ru/"; // URL российского новостного сайта
    private static final String OUTPUT_FILE = "lr10/task8/news.txt";
    private static final int MAX_RETRIES = 3; // Количество повторных попыток

    public static void main(String[] args) {
        Document document = fetchHtmlWithRetry(URL, MAX_RETRIES);
        if (document != null) {
            parseAndSaveNews(document);
        } else {
            System.out.println("Не удалось получить HTML-код после нескольких попыток.");
        }
    }

    private static Document fetchHtmlWithRetry(String url, int maxRetries) {
        int attempt = 0;
        while (attempt < maxRetries) {
            try {
                return Jsoup.connect(url).timeout(5000).get();
            } catch (IOException e) {
                attempt++;
                System.out.println("Ошибка загрузки страницы (попытка " + attempt + " из " + maxRetries + ")");
                try {
                    TimeUnit.SECONDS.sleep(2); // Ожидание перед повторной попыткой
                } catch (InterruptedException ignored) {}
            }
        }
        return null;
    }

    private static void parseAndSaveNews(Document document) {
        Elements newsItems = document.select(".card-mini"); // Селектор для новостных элементов на Lenta.ru
        StringBuilder newsData = new StringBuilder();

        for (Element item : newsItems) {
            String title = item.select(".card-mini__title").text();
            String link = item.select("a").attr("href");
            if (!link.startsWith("http")) {
                link = "https://lenta.ru" + link; // Добавляем домен, если ссылка относительная
            }

            newsData.append("Заголовок: ").append(title).append("\n")
                    .append("Ссылка: ").append(link).append("\n\n");
        }

        saveToFile(newsData.toString());
    }

    private static void saveToFile(String data) {
        try (FileWriter writer = new FileWriter(OUTPUT_FILE, true)) {
            writer.write(data);
            System.out.println("Данные успешно сохранены в " + OUTPUT_FILE);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
