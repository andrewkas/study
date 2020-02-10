package messenger;

import messenger.api.IUser;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

public class Registration {

    public User registration(String name, String pass) {
        if(Load.users.contains(name)) {
            throw new IllegalArgumentException("Такой пользователь уже есть");
        }
        if (!(Validation.validPass(pass))) { throw new IllegalArgumentException("Пароль не подходит! Минимум 7 символов из которых минимум " +
                "1 цифра, одна заглавная буква, и один символ, буквы латинского алфавита!");
        }
            Random rnd = new Random();
            int id = rnd.nextInt(10000);
            Load.users.add (new User(id, name, pass));
            return new User(id, name, pass);

        }
    }


