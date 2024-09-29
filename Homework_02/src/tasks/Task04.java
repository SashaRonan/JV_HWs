package tasks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task04 {

    public static void main(String[] args) {
        String filePath = "output.txt";
        writeToFile(testCopy(), filePath);
    }

    public static String testCopy() {
        StringBuilder test = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            test.append("TEST");
            test.append("\n");
        }
        return test.toString();
    }

    public static void writeToFile(String content, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
