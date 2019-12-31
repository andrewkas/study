package homework;

import java.io.IOException;
import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        //int a = int i(0);
        double a= Integer.parseInt(String.valueOf(i.charAt(0)));
        char c = i.charAt(1);
        double b = Integer.parseInt(String.valueOf(i.charAt(2)));
        Calc calc = new Calc();
        switch (c) {
            case '+':
                System.out.print(+a+" + "+b+" = "+calc.add(a, b));
                break;
            case '-':
                System.out.println(+a+" - "+b+" = "+calc.sub(a, b));
            case '*':
                System.out.println(+a+" * "+b+" = "+calc.mult(a, b));
            case '/':
                System.out.println(+a+" / "+b+" = "+calc.separ(a, b));
        }
    }
}







