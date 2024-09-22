//  Задание 1. Нахождение факториала числа
//  Напишите метод factorial, который принимает число n и возвращает его
//  факториал. Если число n < 0, метод должен вернуть -1.

package Answers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Факториал равен: " + factorial() + "!");
    }

    public static int factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        } else if (n < 0) {
            fact = -1;
        }
        return fact;
    }
}
