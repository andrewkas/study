package messenger;

import messenger.api.ISaveMessage;

import java.io.*;

public class SaveMessage implements ISaveMessage {

    @Override
    public void saveMess(Chat chat) {
        try (OutputStream stream=new FileOutputStream("file_text.txt");
             PrintWriter writer=new PrintWriter(stream))
        {
            writer.println(chat.toString());
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
    }
}}

