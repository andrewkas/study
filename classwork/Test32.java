package classwork;

import java.util.Scanner;

public class Test32 {
    public static void main(String[] args) {
        String a="Мама мыла раму";
        String b="Мама"+" мыла "+"раму";
        Scanner scan =new Scanner(System.in);
        String c= scan.nextLine();
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b==c);
        System.out.println(b.equals(c));
        System.out.println(b);

    }
}
