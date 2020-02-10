package messenger;

import messenger.api.IUser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

public class Load {
    public static Set<IUser> users = new HashSet<>();
    public void loadUser (){
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("user.txt"));
            users =((HashSet<IUser>)ois.readObject());
            } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
