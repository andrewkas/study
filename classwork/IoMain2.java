package classwork;

import messenger.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class IoMain2 {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        User u =new User(11,"serio", "E412qw?fdf");
        User u1=new User(12,"erty", "erR45/dfs4");
        users.add(u);
       // users.add(u1);
        try (OutputStream stream=new FileOutputStream("file_text.txt", true);

            ObjectOutputStream objectOutputStream=new ObjectOutputStream(stream)){
           // objectOutputStream.writeObject(u);
            objectOutputStream.writeObject(users);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//изучить методы writeObject,