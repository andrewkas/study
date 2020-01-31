package messenger;

import messenger.api.IMessage;
import messenger.api.MessageType;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;

import static messenger.Chat.users;

public class Main {
    public static void main(String[] args) {

        Registration registration=new Registration();
        User user1=registration.registration("abra@kadabra.by","12WWer%32y");
        User user2=registration.registration("kadabra@abra.by", "q2weY?tyq");
        // User user3=registration.registration("abra@kadabru.by","12345");
      //  System.out.println(user1);
       // System.out.println(user2);

        Chat chat=new Chat(new ArrayList<>());

        chat.addMessage(new Message(user1, MessageType.TEXT, new Date(),"Проверка связи"));
        chat.addMessage(new Message(user2, MessageType.TEXT, new Date(), "Связь есть!!!"));
        chat.addMessage(new Message(user1, MessageType.TEXT, new Date(),"Как дела?"));
        chat.addMessage(new Message(user2, MessageType.TEXT, new Date(), "Норм"));
        chat.saveMessage(chat);
        chat.getMessages();
        //chat.addMessage(new Message(user1,MessageType.STICKER, new Date(),"Стыкер"));
        //System.out.println(chat);
        try {
            OutputStream os=new FileOutputStream("user.txt");
            ObjectOutputStream oos=new ObjectOutputStream(os);
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
