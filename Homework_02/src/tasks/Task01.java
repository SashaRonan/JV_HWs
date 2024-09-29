package tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество повторений символов: ");
        int n = sc.nextInt();
        System.out.println("Результат : " + concutChars(n) + " !");
    }

    public static StringBuilder concutChars(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый символ: ");
        String c1 = sc.nextLine();
        System.out.println("Введите второй символ: ");
        String c2 = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(c1);
            result.append(c2);
        }
        return result;
    }
}
