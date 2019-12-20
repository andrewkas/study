package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Home3_4 {//Дружественные числа

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа определения дружественности чисел. \nВведите первое натуральное число :");
        int first = in.nextInt();
        System.out.println("Введите второе натуральное число :");
        int second = in.nextInt();
        if (friendlyNum(first,second)) System.out.println("Числа " +first+" и "+second+" дружественные");
        else System.out.println("Числа " +first+" и "+second+" не дружественные");
    }

    public static boolean friendlyNum(int x, int y) {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum1 += i;
            }
        }
        for (int j = 1; j <= y / 2; j++) {
            if (y % j == 0) {
                sum2 += j;
            }
        }
        if (sum1 == y & sum2 == x) return true;
        else return false;

    }
}