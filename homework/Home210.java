package homework;

import java.util.Scanner;

public class Home210 { //Ввод массива и вывод разными циклами, вывод каждого второго элемента массива
    public static void main(String[] args) {
        int i, sum=1,j=0,k=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int []array=new int[size];
        for (i=0; i<size;i++) {
            System.out.println("Введите элемент массива №"+sum+" :");
            int num = in.nextInt();
            sum++;
            array[i] = num;}

        System.out.print("\nВывод массива циклом for : ");
        for (i=0; i<size;i++){
            System.out.print(array[i]+" ");}

        System.out.print("\nВывод массива циклом do...while : ");
        do{
            System.out.print(array[j]+" ");
            j++;
        }while(j<size);

        System.out.print("\nВывод массива циклом while : ");
        while (k<size){
            System.out.print(array[k]+" ");
            k++;
        }

        System.out.print("\nВывод массива циклом foreach : ");
        for(int l:array){
            System.out.print(l+" ");}

        System.out.print("\nВывод каждого второго элемента массива : ");
        for (i=1; i<size;i++){
            if (i%2==0)
            System.out.print(array[i]+" ");}

    }
}



