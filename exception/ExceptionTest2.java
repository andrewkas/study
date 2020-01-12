package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ExceptionTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer s = null;
        do {
            System.out.println("Введите цифры");
            try {
                s = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Только цифры");
            }
        } while (s == null);
        System.out.println("Вы ввели " + s);
    }
}

