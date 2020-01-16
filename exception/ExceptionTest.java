package exception;

import exception.api.MyChekedException;

public class ExceptionTest {
    public static void main(String[] args) {
        int i = method1(0);
        System.out.println(i);

    }

    public static int method1(int data) {
        try {
            int result = method2(data);
            System.out.println("Мы получили " + result);
            return result;
        } catch (Exception err) {
            System.out.println("Возникла ошибка" + err.getMessage());
        }
        return -1;
    }

    public static int method2(int data) throws MyChekedException {
        if(data==1){
            return method3(data);
        }else{
        return method3(data);}

    }

    public static int method3(int data) throws MyChekedException {
        if (data == 0) {
            //try {
            throw new MyChekedException(" Переданные данные не могут быть 0");
            // } catch (MyChekedException e) {
            //     e.printStackTrace();
            //  }}
        }
            return 999;
        }
    }


