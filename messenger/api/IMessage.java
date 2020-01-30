package messenger.api;

import messenger.User;

import java.awt.*;
import java.util.Date;

public interface IMessage <T>{

    User getUser();
    MessageType getType();
    Date getDate();
    T getData( );
//   void setDate(Date date);
//   T getData();
//   void setData(T data);
}
