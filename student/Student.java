package student;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;
    private int rating;

    public Student(String surname,String name,int rating){
        this.surname=surname;
        this.name=name;
        this.rating=rating;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getRating() {
        return rating;
    }

  }
