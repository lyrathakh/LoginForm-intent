package com.example.kshrd.loginform;

/**
 * Created by kshrd on 5/18/17.
 */

public class Person {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
