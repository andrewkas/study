package messenger;

import messenger.api.IMessage;
import messenger.api.IUser;
import messenger.api.MessageType;

import java.util.*;

public class Chat {
    private List<IMessage> messages;
    public static Map<String, User> users = new HashMap<>();

    public Chat(List<IMessage> messages) {
        this.messages = messages;
    }

    public void addMessage(IMessage message) {
        if (!MessageType.TEXT.equals(message.getType())) {
            throw new IllegalArgumentException("Данный чат поддерживает пока только текст");
        }
        messages.add(message);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "messages=" + messages +
                '}';
    }
}