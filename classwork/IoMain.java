package classwork;

import java.io.*;

public class IoMain {
    public static void main(String[] args) {
        try (OutputStream stream=new FileOutputStream("file_text.txt");
            PrintWriter writer=new PrintWriter(stream))//второй параметр boolean true дописывает в файл
        {
            writer.println("Привет как дела");//по умолчанию в корневую директорию проекта// изучить file,gzip,...
            writer.flush();
            writer.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
