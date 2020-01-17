package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeArray {
    public static void main(String[] args) {
        int i, sum = 1;
       int cashe=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array1 = new int[size];

           do {

        try {for (i = 0; i < size; i++) {
                         System.out.println("Введите элемент массива №" + sum + " :");
                        int num = scanner.nextInt();
                        array1[i] = num;
                        sum++;}


                } catch (InputMismatchException ex) {
                    cashe++;
                    System.out.println("Введите число");
                   }
            }while(cashe<3);


        System.out.print("Ваш введенный массив : ");
        System.out.println(Arrays.toString(array1));


            }




    }
