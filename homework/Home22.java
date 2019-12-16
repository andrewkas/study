package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Home22 { // Пузырьковая сортировка
    public static void main(String[] args) {
        int i, sum = 1, t;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("Введите элемент массива №" + sum + " :");
            int num = in.nextInt();
            sum++;
            array[i] = num;
        }
        System.out.print("Ваш введенный массив : ");
        System.out.println(Arrays.toString(array));
        for(int a=1;a<size;a++)
            for(int b=size-1;b>=a;b--)
                if (array[b - 1] > array[b]){
                    t=array[b-1];
                    array[b-1]=array[b];
                    array[b]=t;
                }
        System.out.print("Отсортированный массив :");
        System.out.println(Arrays.toString(array));
            }

    }
