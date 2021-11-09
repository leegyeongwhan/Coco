package week2.Accountbook;

import java.util.HashMap;

public class User {
    private String id;
    private String password;
    HashMap<String, String> log = new HashMap<String, String>();


    User() {

    }

    User(String id, String password) {
        this.id = id;
        this.password = password;
    }


    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    void setId(String id) {
        this.id = id;
    }

    void setPassword(String password) {
        this.password = password;
    }
}
