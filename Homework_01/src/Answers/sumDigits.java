//Задача 3. Подсчет суммы цифр числа
//        Напишите метод sumDigits, который принимает целое число n и возвращает
//        сумму его цифр.


        package Answers;

import java.util.Scanner;

public class sumDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр равна вашего числа : " + countSumDigits(n) + " !");
    }

    public static int countSumDigits(int n) {
        int sum = 0;
        while (n > 1) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

}