package messenger;

import messenger.api.IMessage;
import messenger.api.MessageType;

import java.util.Date;
import java.util.Set;

public class Message <T>implements IMessage<String> {
private User user;
private Date date;
private String data;
private MessageType type;

public Message(User user,MessageType messageType, Date date, String data) {
    this.user=user;
    this.type=messageType;
    this.date=date;
    this.data=data;


}
    @Override
    public User getUser() {
        return user;
    }

    @Override
    public MessageType getType() {
        return type;
    }

    @Override
    public Date getDate() {
        return date;
    }





    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", date=" + date +
                ", data='" + data + '\'' +
                ", type=" + type +
                '}';
    }
}
