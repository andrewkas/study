package generics;

public class Box <T>{
private T item;

public T getItem(){
    return item;
}
public void setItem(T item) {
    this.item = item;
    }
    public static  <Z> Z hello(Z data){
    return (Z) Integer.valueOf(String.valueOf(data));
    }


}
