//Задача 2.
//        Создание CSV-строки из массива объектов
//        Дан массив объектов, где каждый объект представляет собой строку данных, и
//        массив заголовков. Создайте строку CSV, где строки данных разделяются новой
//        строкой, а значения в строках разделяются запятыми.
//        Пример:
//        String[] headers = {"Name", "Age", "City"};
//        String[][] data = {
//        {"John", "30", "New York"},
//        {"Alice", "25", "Los Angeles"},
//        {"Bob", "35", "Chicago"}
//        };
//        Результат:
//        Name,Age,City
//        John,30,New York
//        Alice,25,Los Angeles
//        Bob,35,Chicago

package homeworks;

public class generateCSV {
    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
                {"John", "30", "New York"},
                {"Alice", "25", "Los Angeles"},
                {"Bob", "35", "Chicago"}
        };
        String csv = generateCSV(headers, data);
        System.out.println(csv);
    }

    public static String generateCSV(String[] headers, String[][] data) {

        StringBuilder csvBuilder = new StringBuilder();
        csvBuilder.append(String.join(",", headers)).append("\n");
        for (String[] row : data) {
            csvBuilder.append(String.join(",", row)).append("\n");
        }
        String csv = csvBuilder.toString().trim();
        return csv;
    }
}

