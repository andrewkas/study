package messenger;

import messenger.api.IMessage;
import messenger.api.MessageType;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Registration registration=new Registration();
        User user1=registration.registration("abra@kadabra.by","12345");
        User user2=registration.registration("kadabra@abra.by", "qwerty");
       // User user3=registration.registration("abra@kadabru.by","12345");
        System.out.println(user1);
        System.out.println(user2);

        Chat chat=new Chat(new ArrayList<>());

        chat.addMessage(new Message(user1, MessageType.TEXT, new Date(),"Проверка связи"));
        chat.addMessage(new Message(user2, MessageType.TEXT, new Date(), "Связь есть!!!"));
        chat.addMessage(new Message(user1, MessageType.TEXT, new Date(),"Как дела?"));
        chat.addMessage(new Message(user2, MessageType.TEXT, new Date(), "Норм"));
        //chat.addMessage(new Message(user1,MessageType.STICKER, new Date(),"Стыкер"));

        System.out.println(chat);



    }
}
