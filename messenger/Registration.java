package messenger;

import messenger.api.IUser;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

public class Registration {

    public User registration(String name, String pass) {
        if (Chat.users.containsKey(name)) {
            throw new IllegalArgumentException("Такой пользователь уже есть");
        }
        if (!(Validation.validPass(pass))) { throw new IllegalArgumentException("Пароль не подходит!");
        }
            Random rnd = new Random();
            int id = rnd.nextInt(10000);
            Chat.users.put(name, new User(id, name, pass));
            return new User(id, name, pass);

        }
    }


