package homework;

import java.util.Scanner;

public class HomeException {
    public static void main(String[] args) throws CheckException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите делимое число");
        int i=scanner.nextInt();
        System.out.println("Введите делитель");
        int j=scanner.nextInt();
       checkEx(j);
       HomeException2.checkEx(j);

        System.out.println("Результат деления :" +i/j);

    }

    public static int checkEx(int s) throws CheckException {

        if (s==0)
            throw new CheckException("Вы ввели нодопустимое значение, деление на ноль не допустимо! ");


        return s;
    }
}
