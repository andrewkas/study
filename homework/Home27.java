package homework;

public class Home27 {//таблица умножения

    public static void main(String[] args) {
     int i, j;
     // for (i = 1; i <= 10; i++) {// это был первый вариант, но это не таблица, а список
     //     for (j = 1; j <= 10; j++) {
     //         System.out.println(i + " x " + j + " = " + i * j);
     //         System.out.println();
          for(i=1,j=1;i<=10;i++){ //но эта мне понравилась больше
            System.out.print(i+" x "+j+" = "+i*j+"\t\t");
            if(i==10 && j<10){
                System.out.println();
                i=0;
                j++;
                 }
        }
    }
}