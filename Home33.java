import java.util.Scanner;

public class Home33 {
    public static void main(String[] args) {
        String a = "Мама мыла раму";//переменная инициализируется литералом
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();//т.к. переменная создается через конструктор, вначале выделяется память
        // под новый объект, а потом инициализация. т.е. создается новый объект
         c=c.intern();//происходит переопределение ссылки с объекта на литерал

        System.out.println(a==c);

    }
}

