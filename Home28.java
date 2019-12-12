public class Home28 {//факториал числа  (только из командной строки)
    //Нормальные значения показывает до 20, дальше идет переполнение переменной
    //типа long

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long res=1,i=1;
        while(i<=n){
            res*=i;
            ++i;
        }
      System.out.println("Factorial "+n+" = " +res);
        }
    }

