//Задача 2. История посещения веб-сайтов
//        Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
//        Используйте Deque для хранения истории.
//        ● visitSite(String site): Добавляет сайт в историю посещений.
//        ● back(int steps): Возвращает название сайта, который был посещен
//        steps назад, или null, если таких шагов нет.
//        ● getHistory(): Возвращает список сайтов в истории посещений, от
//        последнего посещенного к первому.



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class BrowserHistory {

    // Хранилище для истории посещений сайтов
    private Deque<String> history = new ArrayDeque<>();

    // Добавление сайта в историю
    public void visitSite(String site) {
        history.addFirst(site); // добавляем сайт в начало очереди
    }

    // Возвращение сайта, который был посещен steps назад
    public String back(int steps) {
        return history.stream()
                .skip(steps) // пропускаем нужное количество шагов
                .findFirst() // находим первый оставшийся элемент
                .orElse(null); // если шагов больше, чем элементов, возвращаем null
    }

    // Получение всей истории посещений
    public List<String> getHistory() {
        return history.stream().collect(Collectors.toList());
    }

    // Тестирование программы
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        // Посещение сайтов
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("yahoo.com");
        browserHistory.visitSite("github.com");

        // Возврат на несколько шагов назад
        System.out.println("2 шага назад: " + browserHistory.back(2)); // google.com
        System.out.println("1 шаг назад: " + browserHistory.back(1)); // yahoo.com
        System.out.println("4 шага назад: " + browserHistory.back(4)); // null

        // Получение всей истории
        System.out.println("История посещений: " + browserHistory.getHistory());
    }
}
