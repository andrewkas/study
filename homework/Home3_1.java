package homework;
import java.util.Random;
import java.util.Random.*;
import java.util.Scanner;

public class Home3_1 {//орел или решка
    public static void main(String[] args) {
        int tail=0, head=0;
        char a;
        Scanner in = new Scanner(System.in);
        Random rand = new Random ();
        System.out.println("Введите количество подбрасываний монеты : ");
        int num=in.nextInt();
        for(int i=0;i<num;i++){
            int rez=rand.nextInt(2);
            if(rez==0){
                tail++;}
             if(rez==1){
                 head++;
            }
        }


        System.out.println("Орел выпал "+head+" раз, решка "+tail+" раз!");

    }
}
