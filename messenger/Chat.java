package messenger;

import messenger.api.IMessage;
import messenger.api.IUser;
import messenger.api.MessageType;

import java.util.*;

public class Chat<IMessages> extends SaveMessage{
    private List<IMessage> messages;
    public static Set< IUser> users = new HashSet<IUser>();

    public Chat(List<IMessage> messages) {
        this.messages = messages;
    }


    public void addMessage(IMessage message) {
        if (!MessageType.TEXT.equals(message.getType())) {
            throw new IllegalArgumentException("Данный чат поддерживает пока только текст");
        }
        messages.add(message);


    }

    public List<IMessage> getMessages() {
        return messages;
    }
 //  public void saveMessage(Chat chat){
 //
 //      chat.getMessages();

// //   for(IMessage mess : messages)
 //      System.out.println(mess);}

    public void saveMessage(Chat chat){

            chat.saveMess(chat);}



    @Override
    public String toString() {
        return "Chat{" +
                "messages=" + messages +
                '}';
    }
}