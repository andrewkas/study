import java.util.Arrays;
import java.util.Scanner;

public class Home31 {
    public static int[] sortChois(int mas[]) {
        for (int a = 0; a < mas.length; a++) {
            for (int b = a + 1; b < mas.length; b++)
                if (mas[a] > mas[b]) {
                    int temp = mas[a];
                    mas[a] = mas[b];
                    mas[b] = temp;
                }
        }
        return mas;
    }

    public static int[] sortBubble(int mas1[]) {
        for (int a = 1; a < mas1.length; a++)
            for (int b = mas1.length - 1; b >= a; b--)
                if (mas1[b - 1] > mas1[b]) {
                    int temp = mas1[b - 1];
                    mas1[b - 1] = mas1[b];
                    mas1[b] = temp;
                }
        return mas1;
    }

    public static int[] sortScrew(int mas2[]) {
        int j = 1, k = mas2.length;
        do {
            for (int a = 0; a < mas2.length - 1; a++) {
                if (mas2[a] > mas2[a + 1]) {
                    int temp = mas2[a];
                    mas2[a] = mas2[a + 1];
                    mas2[a + 1] = temp;
                }
            }
            k--;
            for (int b = k - 1; b >= j; b--) {
                if (mas2[b - 1] > mas2[b]) {
                    int temp = mas2[b - 1];
                    mas2[b - 1] = mas2[b];
                    mas2[b] = temp;
                }
            }
            j++;
        } while (j < k);
        return mas2;
    }

    public static int[] sortInsert(int mas3[]) {
        for (int a = 1; a < mas3.length; a++) {
            for (int b = a; b > 0; b--) {
                if (mas3[b - 1] > mas3[b]) {
                    int temp = mas3[b - 1];
                    mas3[b - 1] = mas3[b];
                    mas3[b] = temp;
                }
            }
        }
        return mas3;
    }

    public static int[] sortQuick(int mas4[], int low, int high) {

        if (mas4.length == 0) {
            return mas4;
        }
        if (low >= high) {
            return mas4;
        }

        int middle = low + (high - low) / 2;
        int opora = mas4[middle];

        int i = low, j = high;
        while (i <= j) {
            while (mas4[i] < opora) {
                i++;
            }

            while (mas4[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = mas4[i];
                mas4[i] = mas4[j];
                mas4[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sortQuick(mas4, low, j);

        if (high > i)
            sortQuick(mas4, i, high);

        return mas4;
    }

    public static int[] sortMerge(int mas5[]) {
        int[] buffer1 = Arrays.copyOf(mas5, mas5.length);
        int[] buffer2 = new int[mas5.length];
        int[] result = sortInner(buffer1, buffer2, 0, mas5.length);
        return result;
    }

    public static int[] sortInner(int[] buffer1, int[] buffer2,
                                  int start, int end) {
        if (start >= end - 1) {
            return buffer1;
        }

        int mid = start + (end - start) / 2;
        int[] sorted1 = sortInner(buffer1, buffer2, start, mid);
        int[] sorted2 = sortInner(buffer1, buffer2, mid, end);

        int index1 = start;
        int index2 = mid;
        int destIndex = start;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < mid && index2 < end) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < mid) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < end) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String[] args) throws java.io.IOException {
        int low, high;
        char choi1, choice, ignore;
        int[] array;

        Scanner in = new Scanner(System.in);
        stop1:
        for (; ; ) {
            do {
                int i, sum = 1;
                System.out.println("Сортировка массива. \nx-Продолжить \nq-Выход");
                choi1 = (char) System.in.read();
                   if (choi1=='q')
                   break stop1;

                else
                System.out.println("Введите размер массива:");
                int size = in.nextInt();
                array = new int[size];
                for (i = 0; i < size; i++) {
                    System.out.println("Введите элемент массива №" + sum + " :");
                    int num = in.nextInt();
                    sum++;
                    array[i] = num;
                }

                low = 0;
                high = array.length - 1;
                System.out.print("Ваш введенный массив : ");
                System.out.println(Arrays.toString(array));
                System.out.println("\nВыберите вид соритровки: \n1.Сортировка выбором \n2.Пузырьковая сортировка");
                System.out.println("3.Шнековая соритровка \n4.Сортировка вставкой \n5.Быстрая сортировка \n6.Сортировка слиянием");
                //System.out.println("q - Выход");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            }
            while (choice < '1' | choice > '6');

            switch (choice) {
                case '1':
                    sortChois(array);
                    System.out.print("Сортировка выбором : ");
                    System.out.println(Arrays.toString(array));
                    break;
                case '2':
                    sortBubble(array);
                    System.out.print("Пузырьковая сортировка : ");
                    System.out.println(Arrays.toString(array));
                    break;
                case '3':
                    sortScrew(array);
                    System.out.print("Шнековая сортировка : ");
                    System.out.println(Arrays.toString(array));
                    break;
                case '4':
                    sortInsert(array);
                    System.out.print("Cортировка вставкой : ");
                    System.out.println(Arrays.toString(array));
                    break;
                case '5':
                    sortQuick(array, low, high);
                    System.out.print("Быстрая сортировка : ");
                    System.out.println(Arrays.toString(array));
                    break;
                case '6':
                    int []result=sortMerge(array);
                    System.out.print("Cортировка слиянием : ");
                    System.out.println(Arrays.toString(result));
                    break;

            }
            System.out.println();

        }
        }
    }
