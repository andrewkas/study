package homework;

import java.util.Arrays;
import java.util.Scanner;
public class Home21 {
    public static void main(String[] args) { // Сортировка выбором
        int i, sum=1,t;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int []array=new int[size];
        for (i=0; i<size;i++) {
            System.out.println("Введите элемент массива №"+sum+" :");
            int num = in.nextInt();
            sum++;
            array[i] = num;}
            System.out.print("Ваш введенный массив : ");
            System.out.println(Arrays.toString(array));

        for (int a=0; a<size;a++) {
            for (int b = a + 1; b < size; b++)
                if (array[a] > array[b]) {
                    t = array[a];
                    array[a] = array[b];
                    array[b] = t;
                }
        }
        System.out.print("Отсортированный массив :");
        System.out.println(Arrays.toString(array));
            }
        }



