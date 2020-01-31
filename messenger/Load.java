package messenger;

import messenger.api.IUser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load {
    public void loadUser (IUser user){
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("user.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
