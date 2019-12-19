package homework;

import java.util.Scanner;

public class Home3_2 {//работа с числами
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите исследуемое число :");
        int i=in.nextInt();
        Greaternum(i);
        System.out.println("Наибольшая цифра :"+Greaternum(i));
        if(SimpNum(i)) System.out.println("Простое");
        else System.out.println("Не простое");
        if (Polinom(i)) System.out.println("Полином");
        else System.out.println("Полиндром");




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
            if (x % 10 == 0);
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        if (temp == n) return true;
        else return false;
    }
    public static Integer Greaternum(int m){
        int temp = 0;
        int x;
        while (m!=0){
            x=m%10;
            m/=10;
            if (x>temp)temp=x;
            }
        return temp;
    }


}

