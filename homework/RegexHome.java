package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHome {
    public static void main(String[] args) {
        String text = "Я люблю Java";
        Pattern pt,pt1,pt2,pt3;
        pt= Pattern.compile("\\d");//проверяем работоспособность обеих методов
        pt1=Pattern.compile("\\d*");//проверяем на наличие цифр в тексте
        pt2=Pattern.compile("\\d+");
        pt3= Pattern.compile("\\d?");
        Matcher matcher,matcher1,matcher2,matcher3;

        matcher = pt.matcher(text);
        matcher1=pt1.matcher(text);
        matcher2=pt2.matcher(text);
        matcher3=pt3.matcher(text);

        System.out.println("find "+matcher.find());//false ищет совпадение в тексте с регулярным выражением
        System.out.println("matches "+matcher.matches());//false проверяет регулярное выражение, переданное в параметре  на полное соответствие тексту
        System.out.println("find* "+matcher1.find());//true ищет совпадение, которое может быть а может не быть
        System.out.println("matches* "+matcher1.matches());//false ищет полное совпадение  тексту, которое может быть а может не быть
        System.out.println("find+ "+matcher2.find());//false проверяет 1 или более совпадений в тексте
        System.out.println("matches+ "+matcher2.matches());//false проверяет 1 или более полных совпадений тексту
        System.out.println("find? "+matcher3.find());//true проверяем наличие 0 или 1 совпадение
        System.out.println("matches? "+matcher3.matches());//false проверяет 0 или 1 полных совпадений тексту интересно почему тогда false???

    }
}

