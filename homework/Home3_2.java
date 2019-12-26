package homework;

import java.util.Scanner;

public class Home3_2 {//работа с числами

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое исследуемое число :");
        int i = in.nextInt();
        Greaternum(i);
        System.out.println("Наибольшая цифра :" + Greaternum(i));
        if (SimpNum(i)) System.out.println("Простое");
        else System.out.println("Не простое");
        if (Polinom(i)) System.out.println("Полином");
        else System.out.println("Полиндром");
        Simpdivid(i);
        System.out.println("\nВведите второе исследуемое число : ");
        int x = in.nextInt();
        Noknod(i, x);
        DifNumbers(i);

    }

    public static boolean SimpNum(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;//не простое
            }
        }
        return true;//простое
    }

    public static boolean Polinom(int n) {

        int temp = 0;
        int x = n;

        while (x != 0) {
            if (x % 10 == 0) ;
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        if (temp == n) return true;
        else return false;
    }

    public static Integer Greaternum(int m) {
        int temp = 0;
        int x;
        while (m != 0) {
            x = m % 10;
            m /= 10;
            if (x > temp) temp = x;
        }
        return temp;
    }

    public static void Simpdivid(int m) {
        System.out.print("Простые делители числа : ");
        for (int i = 2; i <= m; i++)
            stop1:{
                int s = m % i;
                if (s != 0) {
                    continue;
                } else {
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) break stop1;
                    }
                    System.out.print(i + " ");
                }
            }
    }

    public static void Noknod(int n, int e) {
        // System.out.print("");
        stop2:
        for (int i = 2; i <= n; i++) {
            int s = n % i;
            int p = e % i;
            if (s != 0) {
                continue;
            } else if (s == 0 & p == 0) {
                System.out.println("НОК : " + i);
                break stop2;
            }
        }

        for (int j = n; j > 1; j--) {
            int k = n % j;
            int l = e % j;
            if (k != 0) {
                continue;
            } else if (k == 0 & l == 0) {
                System.out.println("НОД : " + j);
                return;
            }
        }
        System.out.println("НОК И НОД отсутствует!");
    }

  // public static void Difnum(int x){ //Не доделана (считает не верно)
  // int j = 0;
  // int m;
  // int l = x;
  // int sum = 0;
  // // int i = 0;
  //     for (l = x; l > 0; ) {
  //     // while (l != 0) {
  //     int a = l % 10;
  //     l /= 10;
  //     // i++;
  //     for (m = l; m > 0; m /= 10) {
  //         int b = m % 10;
  //         if (a == b) {
  //             j++;


  //         }
  //     }

  // }
  // sum = sum + j;
  //         System.out.println("Количество пар цифр в числе - " +x+" : "+sum );
//}
    public static void DifNumbers(int num) {
        System.out.printf("Количество уникальных цифр числа %d: ", num);
        int num2 = num;
        int d = 0;
        int d2 = 0;
        int count = 0;
        int q = 0;
        for (int i = 1; num > 0; num /= 10) {
            d = num % 10;
            count = 0;
            num2 = num;
            for (int j = 1; num2 > 0; num2 /= 10) {
                d2 = num2 % 10;
                if (d == d2) {
                    count++;
                }
            }
            if (count < 2) {
                q++;
            }
        }
        System.out.print(q);
        System.out.println("");
    }

}



