package homework;

import java.util.Scanner;

public class Home3_3 {//Определение совершенного числа

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите исследуемое натуральное число : ");
        int x = in.nextInt();
         if(perfectNum(x)) System.out.println("Число "+x+" совершенное");
        else System.out.println("Число "+x+" не совершенное");
    }
        public static boolean perfectNum(int i){
        int sum=0;
            for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                sum+=j;
            }

    }

            if (sum==i) return true;
            else return false;

}
    ;
}
