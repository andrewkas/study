package homework;

import java.io.IOException;
import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        char[] x = i.toCharArray();
        String str1 = "";
        String str2 = "";
        String operator = "";
        char charTmp = ' ';
        int count = 0;
        int countFirsDigit = 0;
        int countSecondDigit = 0;
        double a = 0;
        double b = 0;

        while (count < x.length - 1) {
            char c = x[countFirsDigit];

            if (Character.isDigit(c)) {//проверка является ли символ числом
                String strTmp = Character.toString(c);//преобразование char в String
                str1 = str1.concat(strTmp);//склеивание последовательности символов
                a = Double.parseDouble(str1);//преобразование строки чисел в double
                countFirsDigit++;//счетчик первого числа
                count++;//общий счетчик
                countSecondDigit++;//счетчик второго числа

            } else {
                countSecondDigit++;
                count = countSecondDigit;

                charTmp = c;//определяем оператор
                operator = Character.toString(charTmp);

                char c2 = x[countSecondDigit];

                if (Character.isDigit(c2)) {
                    String strTmp = Character.toString(c2);
                    str2 = str2.concat(strTmp);
                    b = Double.parseDouble(str2);
                }
            }
        }
        Calc calc = new Calc();
        switch (operator) {
            case "+":
                System.out.print(+a + " + " + b + " = " + calc.add(a, b));
                break;
            case "-":
                System.out.println(+a + " - " + b + " = " + calc.sub(a, b));
                break;
            case "*":
                System.out.println(+a + " * " + b + " = " + calc.mult(a, b));
                break;
            case "/":
                try {
                    System.out.println(+a + " / " + b + " = " + calc.separ(a,b));
                } catch (ArithmeticException exc) {
                    System.out.println("Попытка деления на ноль!");}

            //    try {
            //        System.out.println(+a + " / " + b + " = " + calc.separ(a,b));}
            //    finally {
            //        System.out.println("Проверка try-finally");
            //    }

            //    try {
            //        System.out.println(+a + " / " + b + " = " + calc.separ(a,b));
            //    } catch (ArithmeticException exc) {
            //        System.out.println("Попытка деления на ноль!");}
            //    finally {
            //        System.out.println("Проверка try-catch-finally");
            //    }


                    break;
                }
        }
    }








