package com.wappi.qa.models;

public class ProfileData {
    private String name;
    private String lastName;
    private String birth;

    public ProfileData(String name, String lastName, String birth){
        this.name = name;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirth() {
        return birth;
    }
}
