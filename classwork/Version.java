package classwork;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR,ElementType.FIELD})// аннотоация к методу или к конструктору или полю, короче к чему небудь
@Retention(RetentionPolicy.RUNTIME)//говорит о необходимости сохранения информации в class файле
public @interface Version {
    String info() default "1.0.0";




}


