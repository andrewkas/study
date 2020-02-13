package student;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StudentMain {
    public static void main(String[] args) {
        File f = new File("save.txt");
        if (f.exists()) {
            List<Student> list = Load.loadList("save.txt");
            selectList(list);
        } else {
            List<Student> list = null;
            list = Stream.generate(() -> new Student(GenerateStudent.surname(), GenerateStudent.name(), GenerateStudent.rating()))
                    .limit(100).collect(toList());
            Saver.SaveList("save.txt", list);
            selectList(list);
        }
    }

    public static void selectList(List<Student> list) {
        List<Student> list1 = null;
        List<Student> list2 = null;

        list1 = list.stream().filter(Objects::nonNull).filter(x -> x.getRating() < 7).collect(toList());
        list2 = list1.stream().filter(Objects::nonNull).sorted(Comparator.comparing(Student::getRating).reversed())
                .collect(toList());
        Saver.SaveList("sortedList.txt", list2);
        ToString.listToString("student.txt", list2);
        Saver.SaveList("without.txt",withoutSertificate("sortedList.txt"));
        ToString.listToString("studentWithout.txt",withoutSertificate("sortedList.txt") );
//        System.out.println(list.toString());
//        System.out.println(list1.toString());
    }

    public static List<Student> withoutSertificate(String file) {
        List<Student> listx =Load.loadList(file);
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            int num = rnd.nextInt(listx.size());
            listx.remove(num);
        }
        return listx;
    }
}

