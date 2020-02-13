package student;

import java.util.Random;

public class GenerateStudent {

    public static String surname() {
        Random random = new Random();
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            s.append(a.charAt(random.nextInt(a.length())));
        }
        return s.toString();}
    public static String name() {
        Random random = new Random();
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            s.append(a.charAt(random.nextInt(a.length())));
        }
        return s.toString();
    }
    public static int rating(){
        Random rnd = new Random();
        int id = rnd.nextInt(10);
        return id;
    }
}
