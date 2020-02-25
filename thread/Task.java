package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {
        List<Integer>ls=new ArrayList<>();
        int count=0;
        int mul = 1;
        Random rd=new Random();
        int i =rd.nextInt(10)+1;
        while (count!=i){
            int num=rd.nextInt(10)+1;
            ls.add(num);
            for(int a=1;a<=ls.size();a++ ){
                mul=ls.get(a-1)*ls.get(a);
            }
            count++;
        }
        return mul;
    }
}
