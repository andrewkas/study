package homework;

public class HomeException2 extends HomeException{
    public static int checkEx(int s) throws CheckException{
        if(s<=1)
            throw new CheckException("Деление на еденицу ничего не дает");

        return s;
    }

}
