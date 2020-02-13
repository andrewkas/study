package student;

import java.io.*;
import java.util.List;

public class Saver {
    public static void SaveList(String file, List<Student>list){
        ObjectOutputStream writer = null;
        try {
            writer = new ObjectOutputStream(new FileOutputStream(file));
             writer.writeObject(list);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

