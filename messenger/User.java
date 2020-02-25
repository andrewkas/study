package messenger;


import messenger.api.IUser;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.Serializable;

public class User implements IUser , Serializable {
    private int id;
    private String name;
    private String password;
    private Object User;

    public User(int id, String name, String password)
    {
        this.id=id;
        this.name=name;
        this.password=password;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Object getUser(){
        return User;
    }

    @Override
    public void setId(int i) {
        this.id=i;

    }

    @Override
    public void setName(String n) {
        this.name=n;
    }

    @Override
    public void setPassword(String p) {
        this.password=p;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(getId());
        out.writeObject(getName());
        out.writeObject(getPassword());
    }

    private void readObject(java.io.ObjectInputStream in)  throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        setId(in.readInt());
        setName((String)in.readObject());
        setPassword((String)in.readObject());
    }

    private void readObjectNoData() throws InvalidObjectException {
        throw new InvalidObjectException("потока нет");
}}







