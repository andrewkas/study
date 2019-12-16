package homework;

public class Home29 { //перемножение цифр аргумента (из командной строки)
    public static void main(String[] args) {
        String str = args[0];
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println("\nInput number :" + str);
        int sum1 = 1, j;
        for (j = 0; j <= str.length() - 1; j++) {
            System.out.print(array[j]);
            sum1 *= array[j];
            if (j == str.length() - 1)
                break;
                System.out.print(" x ");

        }
        System.out.print(" = ");
        System.out.println(sum1);
    }
}




