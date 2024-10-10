//Задача 4. Сортировка слиянием
//        Напишите программу, которая реализует сортировку слиянием. Программа
//        должна содержать два основных метода: merge для объединения двух
//        отсортированных массивов в один отсортированный, и mergeSort для
//        сортировки массива с использованием сортировки слиянием.



import java.util.Arrays;

public class MergeSort {

    // Метод для слияния двух отсортированных массивов
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length]; // результирующий массив
        int i = 0, j = 0, k = 0; // индексы для массивов left, right и result

        // Слияние массивов, пока в обоих массивах есть элементы
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++]; // добавляем меньший элемент из left
            } else {
                result[k++] = right[j++]; // добавляем меньший элемент из right
            }
        }

        // Копируем оставшиеся элементы из left, если они есть
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Копируем оставшиеся элементы из right, если они есть
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result; // возвращаем объединенный массив
    }

    // Метод для сортировки массива слиянием
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array; // базовый случай: если массив длиной меньше 2, он уже отсортирован
        }

        int mid = array.length / 2; // делим массив на две части
        int[] left = Arrays.copyOfRange(array, 0, mid); // левая половина
        int[] right = Arrays.copyOfRange(array, mid, array.length); // правая половина

        // Рекурсивно сортируем обе половины и объединяем их
        return merge(mergeSort(left), mergeSort(right));
    }

    // Тестирование программы
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Неотсортированный массив: " + Arrays.toString(array));

        // Выполняем сортировку слиянием
        int[] sortedArray = mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }
}
