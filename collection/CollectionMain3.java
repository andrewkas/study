package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionMain3 {
    public static void main(String[] args) {
  //      List<String> list = new ArrayList<String>();
  //      list.add("One");
  //      list.add("two");
  //      list.add("six");
  //      list.add("three");
  //      list.add("four");
  //      list.add("five");
  //      list.add("Ten");
  //      Stream stream = list.stream();
//
  //     // stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);
//
  //     // stream.forEach(x->System.out.println(x));
//
//
  //      stream.filter(x-> x.toString().length() == 3).map(x -> x + " - the length of the letters is three").forEach(x -> System.out.println(x));
   //    String[] array = {"Java", "Ruuuuussshhh"};
   //    Stream<String> streamOfArray = Arrays.stream(array);
   //    streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
   //            .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
   //            .collect(Collectors.toList()).forEach(System.out::println);
     //   Stream.of(2, 3, 0, 1, 3)
     //           .map(x -> IntStream.range(0, x))
     //           .forEach(System.out::print);
int sum = Stream.of(1, 2, 3, 4, 5).reduce( 0,(acc, x) -> acc + x);
        System.out.println(sum);
        System.out.println(Stream.of(1,2,3,4).allMatch(x->x<=4));
    }

}
