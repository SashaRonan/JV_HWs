//Задача 3. Подсчет продуктов в корзине
//        Создайте программу для учета продуктов в корзине. Программа должна
//        позволять добавлять, удалять, обновлять количество продуктов, а также
//        проверять наличие продуктов в корзине. Используйте HashMap для хранения
//        продуктов и их количества.
//        Методы:
//        ● addProduct(String product, Integer quantity): Добавляет
//        продукт с указанным количеством в корзину. Если продукт уже есть,
//        увеличивает его количество.
//        ● removeProduct(String product): Удаляет продукт из корзины. Если
//        продукт отсутствует, ничего не делает.
//        ● updateQuantity(String product, Integer quantity): Обновляет
//        количество продукта в корзине. Если продукта нет, ничего не делает.
//        ● checkProduct(String product): Проверяет, есть ли продукт в
//        корзине и возвращает его количество. Если продукта нет, возвращает 0.
//        ● showBasket(): Выводит все продукты и их количество в корзине.


import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    // Хранилище для продуктов и их количества
    private Map<String, Integer> basket = new HashMap<>();

    // Добавление продукта в корзину
    public void addProduct(String product, Integer quantity) {
        basket.put(product, basket.getOrDefault(product, 0) + quantity); // увеличиваем количество продукта
    }

    // Удаление продукта из корзины
    public void removeProduct(String product) {
        basket.remove(product); // удаляем продукт из корзины
    }

    // Обновление количества продукта
    public void updateQuantity(String product, Integer quantity) {
        if (basket.containsKey(product)) { // проверяем, есть ли продукт в корзине
            basket.put(product, quantity); // обновляем количество
        }
    }

    // Проверка продукта в корзине
    public int checkProduct(String product) {
        return basket.getOrDefault(product, 0); // возвращаем количество продукта или 0, если его нет
    }

    // Вывод всех продуктов и их количества
    public void showBasket() {
        if (basket.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("Продукты в корзине:");
            for (Map.Entry<String, Integer> entry : basket.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    // Тестирование программы
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Добавление продуктов
        cart.addProduct("Яблоки", 5);
        cart.addProduct("Бананы", 3);
        cart.addProduct("Яблоки", 2); // Увеличиваем количество яблок

        // Вывод корзины
        cart.showBasket(); // Яблоки: 7, Бананы: 3

        // Проверка наличия продукта
        System.out.println("Количество яблок: " + cart.checkProduct("Яблоки")); // 7
        System.out.println("Количество апельсинов: " + cart.checkProduct("Апельсины")); // 0

        // Обновление количества
        cart.updateQuantity("Бананы", 10); // Обновляем количество бананов
        cart.showBasket(); // Яблоки: 7, Бананы: 10

        // Удаление продукта
        cart.removeProduct("Яблоки");
        cart.showBasket(); // Бананы: 10
    }
}
