package ru.ddc.simplebackend.dto;

public class UserData {

    private String name;

    public UserData() {
    }

    public UserData(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
