package homework;

public class RegexHomeFindMain {
    public static void main(String[] args) {
        System.out.println("Количество слова война :"+RegexHomeFind.findWord("\\b[В|в]ойна\\b"));
        System.out.println("Количество слова мир :"+RegexHomeFind.findWord("\\b[М|м]ир\\b"));
        System.out.println("Количество союза и :"+RegexHomeFind.findWord("\\bИ|и\\b"));


    }
}

