package lab10.task04;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "lab10/task04/horoscope.txt";

    public static void main(String[] args) {
        int attempts = 3;
        boolean success = false;

        for (int attempt = 1; attempt <= attempts; attempt++) {
            try {
                System.out.println("Попытка подключения #" + attempt);
                Document doc = Jsoup.connect("https://www.e1.ru/horoscope/daily/").get();
                success = true;
                parseAndSaveHoroscope(doc);
                break;
            } catch (IOException e) {
                System.err.println("Ошибка при подключении: " + e.getMessage());
                if (attempt == attempts) {
                    System.err.println("Превышено количество попыток подключения.");
                }
            }
        }
        if (success) {
            System.out.println("Данные успешно сохранены в файл: " + FILE_PATH);
        } else {
            System.err.println("Не удалось получить данные с сайта.");
        }
    }
    private static void parseAndSaveHoroscope(Document doc) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            Elements newsParent = doc
                    .select("#app > div.global-wrapper > div.app-content > " +
                            "div > div.inner-columns-wrapper > div.central-right-wrapper > " +
                            "div.central-column-container > section");
            for (int i = 2; i < 14; i++) {
                List<Node> nodes = newsParent.get(0).childNodes();
                String theme = ((Element) nodes.get(i))
                        .getElementsByClass("_4K6U+ _9dcVo")
                        .get(0).childNodes().get(0).toString();
                String date = ((Element) nodes.get(i))
                        .getElementsByClass("vpvdP _9TfK4")
                        .get(0).childNodes().get(0).toString();
                String text = ((Element) nodes.get(i))
                        .getElementsByClass("BDPZt KUbeq").text();
                String output = "Тема: " + theme + "\n" +
                        "Дата: " + date + "\n" +
                        "Текст: " + text + "\n\n";
                writer.write(output);
                System.out.print(output);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}