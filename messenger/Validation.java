package messenger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validPass(String pass){
        Pattern pt=Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[':/!?+%]).{6,})");
        Matcher matcher=pt.matcher(pass);
        return matcher.find();
    }
}
