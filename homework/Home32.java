package homework;

public class Home32 {
    public static void main(String[] args) {
            String a = "Мама мыла раму";//создается объект а и присваевается ссылка на литерал кот. заносится в пул литералов
            String b = "Мама" + " мыла " + "раму";//т.к. такой литерал уже существует, ссылка создается на уже
        //расположенный там литерал
            System.out.println(a==b);
    }
}
