import java.util.Arrays;
import java.util.Scanner;

public class Home23 {
    public static void main(String[] args) { //Шнековая сортироовка
        int i, sum = 1, t, a,b;
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
        int j=1, k=size;
        do{
            for(a=0;a<k-1;a++) {
                if (array[a] > array[a + 1]) {
                    t = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = t;
                }
            }
             k--;
             for(b=k-1;b>=j;b--) {
                 if (array[b - 1] > array[b]) {
                     t = array[b - 1];
                     array[b - 1] = array[b];
                     array[b] = t;
                 }
             }
             j++;
                 }while (j<k);
        System.out.print("Отсортированный массив :");
        System.out.println(Arrays.toString(array));
            }

            }




