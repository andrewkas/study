package homework;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RegFind {


    private static Stream<String> INPUT = null;

    public static void find(String s) {
         String REGEX1 = s;


        try {
            INPUT = Files.lines(Paths.get("/Users/andrejkaspar/IdeaProjects/study/homework/Война и мир.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //String INPUT = "война и мир";

        Pattern pt = Pattern.compile(REGEX1);
        Matcher matcher = pt.matcher((CharSequence) INPUT);


        int count = 0;

        while(matcher.find()) {
            count++;
            System.out.println("количество слов "+pt.toString()+" "+count);

        }
    }
    }

