import java.util.Arrays;
import java.util.Scanner;
public class Home211 {//ВВод массива с консоли,
    // сортировка и удаление совпадающих элементов
    public static void main(String[] args) {
        int i, sum = 1, t, a, b;
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
        for (a = 1; a < size; a++) {
            for (b = a; b > 0; b--) {
                if (array[b - 1] > array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }
        System.out.print("Отсортированный массив : ");
        System.out.println(Arrays.toString(array));
        for (int c = 0; c < size; c++) {
            for (int d = c + 1; d < size; d++)
                if (array[c] == array[d]) {
                    array[d] = array[size - 1];
                    size--;
                    d--;
                }
        }
        int[] array2 = Arrays.copyOf(array, size);
        for (a = 1; a < size; a++) {
            for (b = a; b > 0; b--) {
                if (array2[b - 1] > array2[b]) {
                    t = array2[b - 1];
                    array2[b - 1] = array2[b];
                    array2[b] = t;
                }
            }
        }
                System.out.print("Итоговый массив : ");
                System.out.println(Arrays.toString(array2));
        }
    }




