package homework;

import collection.dto.Passport;

import java.util.*;

public class HomeCollection1 {
    public static void main(String[] args) {

        List<Passport> collection = new ArrayList<>();//Генерируем пасспорта и добавлям в ArrayList
        long lStarttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Passport passport = new Passport();
            passport.passportRnd();
            collection.add(passport);
        }
        long lStoptime = System.currentTimeMillis();
        long output = (lStoptime - lStarttime);
        System.out.println("Время добавления в ArrayList : " + output + " миллисекунд");


        long lStarttime3 = System.currentTimeMillis(); //Проходим итератором и удаляем из ArrayList
        Iterator<Passport> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            collection.iterator();
        }
        long lStoptime3 = System.currentTimeMillis();
        long output3 = (lStoptime3 - lStarttime3);
        System.out.println("Время удаления итератором в ArrayList : " + output3 + " миллисекунд");


        List<Passport> collection2 = new LinkedList<>();//Генерируем пасспорта и добавляем в LinkedList
        long lStarttime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Passport passport2 = new Passport();
            passport2.passportRnd();
            collection2.add(passport2);
        }
        long lStoptime2 = System.currentTimeMillis();
        long output2 = (lStoptime2 - lStarttime2);
        System.out.println("Время добавления в LinkedList : " + output2 + " миллисекунд");


        long lStarttime4 = System.currentTimeMillis();
        Iterator<Passport> iterator2 = collection2.iterator();//проходим итератором и удаляем из LinkedList
        while (iterator2.hasNext()) {
            iterator2.next();
            iterator2.remove();
            collection2.iterator();
        }
        long lStoptime4 = System.currentTimeMillis();
        long output4 = (lStoptime4 - lStarttime4);
        System.out.println("Время удаления итератором в LinkedList : " + output4 + " миллисекунд");
    }}