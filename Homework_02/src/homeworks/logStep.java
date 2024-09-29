//Задача 4. Логирование операций с массивом во время поиска
//минимального и максимального элементов
//Реализуйте метод поиска минимального и максимального элементов массива.
//После нахождения каждого элемента (минимального и максимального),
//сделайте запись в лог-файл log.txt в формате год-месяц-день
//час:минуты {минимальный элемент}, {максимальный элемент}.

package homeworks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class logStep {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};
        logStep(arr);
    }

    public static String findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return min + " " + max;
    }

    public static void logStep(int[] arr) {
        String path = "log.txt";
        File file = new File(path);

        try {
            if (file.createNewFile()) {
                System.out.println("Файл был успешно создан: " + file.getName());
            }


            try (FileWriter log = new FileWriter(file, true)) {
                Date now = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String date = formatter.format(now);
                log.write(date + " " + findMinMax(arr) + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом.");
            e.printStackTrace(); // Вывод информации об ошибке
        }
    }
}

