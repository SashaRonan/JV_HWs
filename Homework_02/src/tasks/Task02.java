package tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с повторяющимися символами: ");
        String str = sc.nextLine();
        System.out.println("Результат: " + zipStr(str) + "!");
    }

    public static String zipStr(String str) {
        int count = 1;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                newStr.append(str.charAt(i));
                newStr.append(count);
                count = 1;
            }
        }

        newStr.append(str.charAt(str.length() - 1));
        if (count > 1) {
            newStr.append(count);
        } else {
            newStr.append(1);
        }
        return newStr.toString();
    }
}
