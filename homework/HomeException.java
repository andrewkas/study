package homework;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static homework.HomeException2.checkEx;

public class HomeException {
    public static void main(String[] args) throws CheckException, IOException {
        int i;
        int j;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое число");
        try {i = scanner.nextInt();
         System.out.println("Введите делитель");
            j = scanner.nextInt();
            checkEx(j);
            HomeException2.checkEx(j);
            System.out.println("Результат деления :" + i / j);
        } catch (InputMismatchException ex) {
            HomeException3.ioException();
    }
    }
    public static int checkEx(int s) throws CheckException {
      if(s==0)
          throw new CheckException("Вы ввели нодопустимое значение, деление на ноль не допустимо! ");
       return s;

    }
}
