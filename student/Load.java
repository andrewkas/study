package student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Load {
    public static List<Student> loadList(String file) {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(file)));
            return (List<Student>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
        return null;
    }
}





