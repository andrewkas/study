public class Test2 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        Integer a1 = new Integer(10);

        hello();

        System.out.println(a & b);
    }


    public static void hello(){
        hello1();
    }

    public static void hello1(){
        hello();
    }
}
