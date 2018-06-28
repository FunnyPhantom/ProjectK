package DataModules;

import java.io.Serializable;

public class Daneshjoo implements Serializable {
    private String  id;
    private String name;
    private String email;
    private String number;

    public Daneshjoo(String id, String name, String email, String number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String  getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    final static Daneshjoo KHALI = new Daneshjoo("000","--", "N/A", "N/A");


    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if(! (obj instanceof  Daneshjoo))
            return false;

        return this.id.equals(((Daneshjoo) obj).id);

    }

    @Override
    public String toString() {
        return "Daneshjoo, ID: " + this.getId() + ", Name: " + this.getName() + ", Number: " + this.getNumber();
    }
}
