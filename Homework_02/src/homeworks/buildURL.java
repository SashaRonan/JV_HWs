//Задание 1.
// Формирование URL с параметрами
//Дана строка базового URL:
//https://example.com/search?
//Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
//передаются в виде строки, где ключи и значения разделены =, а пары
//ключ-значение разделены &. Если значение null, то параметр не должен
//попадать в URL.
//        Пример:
//params = "query=java&sort=desc&filter=null"
//Результат:
//https://example.com/search?query=java&sort=desc


package homeworks;

import java.util.Scanner;

public class buildURL {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String baseURL = sc.nextLine();
        System.out.println("Enter params: ");
        String paramsStr = sc.nextLine();

        if (baseURL.endsWith("?")) {
            System.out.println(baseURL + parseParams(paramsStr));
        } else {
            System.out.println(baseURL + "?" + parseParams(paramsStr));
        }

    }


    public static StringBuilder parseParams(String paramsStr) {
        String[] params = paramsStr.split("&");
        StringBuilder result = new StringBuilder();
        for (String param : params) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 2 && !keyValue[1].equals("null")) {
                result.append(keyValue[0] + "=" + keyValue[1] + "&");
            }
        }
        return result.deleteCharAt(result.length() - 1);
    }

}
