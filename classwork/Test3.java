public class Test3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 17;
        int z = 1;

        boolean result = !between(c, a) | !between(a, b)  ;
        System.out.println("Я закончил");
        boolean result2 = between(c, a) || between(a, b);
    }

    public static boolean between(int a, int b){
        System.out.println("Привет, я сравнил для тебя a и b");
        return a > b;
    }
}
