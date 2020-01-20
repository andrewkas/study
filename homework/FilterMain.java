package homework;

import collection.dto.Passport;

import java.util.ArrayList;
import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        List<Passport>list=new ArrayList<>();
        Passport passport1=new Passport();
        Passport passport2=new Passport();
        Passport passport3=new Passport();
        Passport passport4=new Passport();
        Passport passport5=new Passport();
        passport1.passportRnd();
        passport2.passportRnd();
        passport3.passportRnd();
        passport4.passportRnd();
        passport5.passportRnd();
        list.add(passport1);
        list.add(passport2);
        list.add(passport3);
        list.add(passport4);
        list.add(passport5);



    }
}
