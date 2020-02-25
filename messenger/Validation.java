package messenger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean validPass(String pass){
        char[]a=pass.toCharArray();
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]){
                return false;
            }
        }
        Pattern pt=Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[':/!?+%]).{6,})");
        Matcher matcher=pt.matcher(pass);
        return matcher.find();
    }
}
