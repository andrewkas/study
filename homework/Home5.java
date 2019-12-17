import java.util.Scanner;
public class Home5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте! Как Вас зовут?");
        String name = in.nextLine();
        if (name.equals("Вася")) {
            System.out.println("Привет!\n Я тебя так долго ждал!");
            return;
        }
        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал!");
            return;
        }
        System.out.println("Добрый день, а вы кто?");
    }
}
