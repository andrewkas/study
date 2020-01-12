package generics;

public class GenericMain3 {
    public static void main(String[] args) {
        NumberBox<Integer> boxInt= new NumberBox<>();
        boxInt.setItem(123);

        NumberBox<Double> boxDouble =new NumberBox<>();
        boxDouble.setItem(1.3);

        NumberBox<Long> boxLong = new NumberBox<>();
        boxLong.setItem(1234L);

    }
}
