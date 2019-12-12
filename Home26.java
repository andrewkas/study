import java.util.Arrays;
import java.util.Scanner;

public class Home26 { //Честно сдул эту быструю сортировку, т.к. все примеры которые находил были через рекурсию
    // :(( приклеил только ввод массива с консоли

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int i, sum = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] x = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("Введите элемент массива №" + sum + " :");
            int num = in.nextInt();
            sum++;
            x[i] = num;
        }
        System.out.print("Ваш введенный массив : ");
       System.out.println(Arrays.toString(x));

      int low = 0;
      int high = x.length - 1;

      quickSort(x, low, high);
      System.out.print("Отсортированный методом разделения :");
      System.out.println(Arrays.toString(x));
    }
}
