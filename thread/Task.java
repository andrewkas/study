package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {

        int count=0;
        int mul = 1;
        Random rd=new Random();
        int i =rd.nextInt(10)+1;
        while (count!=i) {
            int num = rd.nextInt(10) + 1;
            mul = mul * num;

            count++;
        }
        return mul;
    }
}
