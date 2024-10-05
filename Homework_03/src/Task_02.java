//Задача 2. Уникальные числа
//        Напишите метод, который принимает целочисленный массив и возвращает
//        новый массив, содержащий только уникальные элементы из исходного
//массива.

import java.util.ArrayList;
import java.util.Arrays;

public class Task_02 {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(getUniqueElements(numbers));

    }

    public static ArrayList<Integer> getUniqueElements(Integer[] arrInt) {
        ArrayList<Integer> result = new ArrayList(Arrays.asList(arrInt));
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer num : result) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num); // Добавляем только уникальные планеты
            }
        }
        return uniqueNumbers;
    }
}