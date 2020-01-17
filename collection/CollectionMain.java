package collection;

import collection.dto.Passport;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        List<Passport> collection=new ArrayList<>();
        Passport passport1=new Passport();
        passport1.setId("MP1234");
        passport1.setEffectiveAt(new Date());
        passport1.setFio("Рафик Иванович Пагасян");
        Passport passport2=new Passport();
        passport2.setId("MP1234"+"");
        passport2.setEffectiveAt(new Date());
        passport2.setFio("Рафик Иванович Пагасян");


        collection.add(passport1);
        collection.add(passport2);

        for(Passport passport : collection){
        System.out.println(passport);}

        collection.remove(passport1);

        System.out.println("После удаления");

        for(Passport passport : collection){
            System.out.println(passport);
        }
        System.out.println("test");
        for(int i=0; i<collection.size(); i++){
            System.out.println("index :"+i+" "+collection.get(i));
        }
    }
}
