package student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class ToString {
    public static void listToString(String file, List<Student> list) {

            PrintWriter writer = null;
            try {
                writer = new PrintWriter(new FileOutputStream(file));
                for (Student ls : list)
                writer.println(ls.getSurname()+" "+ls.getName()+" "+ls.getRating());
                writer.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

