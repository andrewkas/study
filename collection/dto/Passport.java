package collection.dto;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Passport {
    private String id;
    private Date effectiveAt;
    private String fio;

    public String getId() {
        return id;
    }

    public Date getEffectiveAt() {
        return effectiveAt;
    }

    public String getFio() {
        return fio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEffectiveAt(Date effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void passportRnd(){
        Random random=new Random();
        setId("MP"+random.nextInt(100000)+"IO");
        setEffectiveAt(new Date());
        setFio(" Джузеппе Иванов ");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", effectiveAt=" + effectiveAt +
                ", fio='" + fio + '\'' +
                '}';
    }
}


