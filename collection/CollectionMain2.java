package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionMain2 {
    public static void main(String[] args) {
  //     Set<String > set=new HashSet<String>();
  //     set.add("2");
  //     set.add("1");
  //     set.add("01");
  //     set.add("2");

  //     for(String s: set){
  //         System.out.println(s);

            Set<String>words = new HashSet<String>();
            words.add("One");
            words.add("Two");
            words.add("Three");

            Iterator<String>iterator=words.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

