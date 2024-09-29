package tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку для проверки на палиндромность: ");
        String str = sc.nextLine();
        System.out.println("Результат : " + isPalindrome(str));
    }

    public static String isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        StringBuilder strForReverse = new StringBuilder(cleanedStr);
        String reversedStr = strForReverse.reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
