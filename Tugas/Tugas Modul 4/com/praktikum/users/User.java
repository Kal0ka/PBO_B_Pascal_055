package com.praktikum.users;

public abstract class User {
    private String name;
    private String nim;
public User (String name, String nim) {
    this.name = name;
    this.nim = nim;
}
    public void setName (String name) {
    this.name = name;
    }
    public void setNim (String nim) {
        this.nim = nim;
    }
    public String getName () {
    return name;
    }
    public String getNim () {
    return nim;
    }

    public abstract boolean login();
    public abstract void displayAppMenu();
}
