//Задача 4*. Нахождение максимального из трех чисел
//Реализуйте две функции:
//        1. Функция findMaxOfTwo должна принимать два числа и возвращать
//максимальное из них, используя только знак сравнения.
//        2. Функция findMaxOfThree должна принимать три числа и находить
//максимальное из них, используя первую функцию


package Answers;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();
        System.out.print("Введите число c: ");
        int c = sc.nextInt();
        System.out.println("Максимальное число равно : " + findMaxOfThree(a, b, c) + " !");
    }

    public static int findMaxOfTwo(int a, int b) {
        int max = 1;
        if (a > b) {
            max = a;
        } else max = b;

        return max;
    }

    public static int findMaxOfThree(int a, int b, int c) {
        int max = findMaxOfTwo(findMaxOfTwo(a, b), findMaxOfTwo(b, c));
        return max;
    }


}
