//Задача 3. Длина слов
//        Реализуйте метод, который принимает на вход массив строк и возвращает
//        новый массив, содержащий только строки, длина которых больше 3 символов


import java.util.ArrayList;
import java.util.Arrays;

public class Task_03 {

    public static void main(String[] args) {
    String [] arr = {"cat", "elephant", "dog", "giraffe"};
    System.out.println(filterShortStrings(arr));
    }

    public static ArrayList<String> filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));
        for (String s : arr) {
            if (s.length() < 4) {
                result.remove(s);
            }
        }

        return result;
    }
}
