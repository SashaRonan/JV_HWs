//Задача 3. Количество вхождений слова
//Реализуйте метод countOccurrences в классе ListUtils, который
//принимает LinkedList<String> и строку, и возвращает количество
//вхождений строки в список


import java.util.LinkedList;

public class ListUtils {

//    private static LinkedList<String> list = new LinkedList<>();

    public  int countOccurrences(LinkedList<String> list, String str) {
        Integer count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                count++;
            }
        }
        return count;
    }
}
