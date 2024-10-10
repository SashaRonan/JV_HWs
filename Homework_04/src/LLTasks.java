//Задание 1. Удаление нечетных строк
//        Дан LinkedList с несколькими элементами. В методе
//        removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
//        которых нечетная. Используйте LinkedList и стандартные методы.


import java.util.LinkedList;

public class LLTasks {

//    public static void main(String[] args) {
//
//
//        LinkedList<String> result = removeOddLengthStrings(months);
//        printLinkedListItems(result);
//    }

    public static LinkedList<String> removeOddLengthStrings(LinkedList<String> list) {
        LinkedList<String> result = new LinkedList<>();
        for (String item : list) {
            if (item.length() % 2 != 0) {
                result.add(item);
            }
        }
        return result;
    }

    public static void printLinkedListItems(LinkedList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
