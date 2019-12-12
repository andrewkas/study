import java.util.Arrays;
import java.util.Scanner;

public class Home25 { // Сортировка слиянием. Жесть! гонял дэбагом несколько раз.
    // ну и конечно-же это........:((
    public static void main(String[] args) {
        int i, sum = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array1 = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("Введите элемент массива №" + sum + " :");
            int num = in.nextInt();
            sum++;
            array1[i] = num;
        }
        System.out.print("Ваш введенный массив : ");
        System.out.println(Arrays.toString(array1));

        int[] result = sort(array1);
        System.out.print("Отсортированный массив : ");
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = sortInner(buffer1, buffer2, 0, array1.length);
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
}