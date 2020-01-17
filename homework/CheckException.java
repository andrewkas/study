package homework;

public class CheckException extends Throwable {
    public CheckException(String message){
        super(message);
    }
    public CheckException(int i){
        super(String.valueOf(i));
    }
}
