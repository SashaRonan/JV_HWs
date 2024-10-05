//Задание 1. Удаление отрицательных значений из массива
//        Реализуйте метод, который принимает на вход целочисленный массив и
//        удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
//        только неотрицательные числа.


import java.util.ArrayList;
import java.util.Arrays;

public class Task_01 {

    public static void main(String[] args) {
        Integer[] numbers = {-1, 2, -3, 4, -5, 6};
        ArrayList arrayList = new ArrayList(Arrays.asList(numbers));
        System.out.println(FilterNegative(arrayList));
    }

    public static ArrayList<Integer> FilterNegative(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                arr.remove(i);
            }
        }
        return arr;
    }
}
