package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class HomeArray {
    public static void main(String[] args) {
        int i, sum = 1;
        int cashe=0;

        Scanner scanner = new Scanner(System.in);
       System.out.println("Введите размер массива:");
       int size = scanner.nextInt();

        int[] array1 = new int[size];
        Integer num=null;
        //scanner.close();
        for (i = 0; i < array1.length;) {

            try {
                System.out.println("Введите элемент массива №" + sum + " :");

                num = Integer.valueOf(scanner.nextLine());//не могу понять почему при первом проходе выкидывает в catch
                array1[i] = num;
                sum++;
                cashe = 0;
                i++;
            } catch (NumberFormatException ex) {
                cashe++;
                if (cashe == 3) {
                    System.out.println("3 ошибки!!! Прощай!");
                    return;}
                System.out.println("Введите число");
                }
            }


                System.out.print("Ваш введенный массив : ");
                System.out.println(Arrays.toString(array1));



            ArrayList<Integer>arrayList=new ArrayList<Integer>();
                     for(int j=0;j<array1.length; j++){
                         arrayList.add(array1[j]);
                     }
                     Collections.sort (arrayList);
        System.out.print("Сортированная коллекция :");

        System.out.println(arrayList);



        }}




