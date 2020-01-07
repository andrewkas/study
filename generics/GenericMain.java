package generics;

public class GenericMain {
    public static void main(String[] args) {
        BoxObjects badBox = new BoxObjects();
        badBox.setItem("Test");
        Integer item = (Integer) badBox.getItem();
    }
}