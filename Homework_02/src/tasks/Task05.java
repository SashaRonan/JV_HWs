package tasks;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task05 {



    // Метод для получения содержимого текущей папки
    public static String[] getDirectoryContent(String filePath) {
        File dir = new File(filePath);
        String[] fileNames;

        // Проверяем, существует ли директория
        if (dir.exists() && dir.isDirectory()) {
            // Получаем список файлов и директорий
            File[] files = dir.listFiles();

            // Проверяем, что массив не пустой
            if (files != null) {
                fileNames = new String[files.length];

                // Заполняем массив именами файлов и папок
                for (int i = 0; i < files.length; i++) {
                    fileNames[i] = files[i].getName();
                }
            } else {
                // Если директория пуста
                fileNames = new String[0]; // Возвращаем пустой массив
            }
        } else {
            // Если указан неверный путь, возвращаем null
            return null;
        }

        return fileNames;
    }

    // Метод для записи массива строк в файл
    public static void writeArrayToFile(String[] content, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : content) {
                writer.write(line);
                writer.newLine(); // Переход на новую строку
            }
        } catch (IOException e) {
            logError("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    // Метод для записи ошибок в лог-файл
    private static void logError(String message) {
        try (BufferedWriter logWriter = new BufferedWriter(new FileWriter("error.log", true))) {
            logWriter.write(message);
            logWriter.newLine(); // Переход на новую строку
        } catch (IOException e) {
            System.err.println("Ошибка при записи в лог: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String currentDirectory = "dirForTask05"; // Текущая директория
        String[] contents = getDirectoryContent(currentDirectory);

        if (contents != null) {
            // Путь к файлу, куда будем записывать содержимое
            String outputFilePath = "dirForTask05_result.txt";
            writeArrayToFile(contents, outputFilePath);
            System.out.println("Содержимое директории записано в файл: " + outputFilePath);
        } else {
            System.out.println("Директория не существует или указанный путь неверен.");
        }
    }

}
