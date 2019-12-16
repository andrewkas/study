package classwork;

public class Test31 {
    public static void main(String[] args) {
       String a="Мама мыла раму";
        String b="Мама мыла раму";

        System.out.println(a==b);
        System.out.println(a==b+"");
        System.out.println(a==b+"\t");
        System.out.println(a==b+"\t ");
        System.out.println(a.equals(b+""));
    }
}
