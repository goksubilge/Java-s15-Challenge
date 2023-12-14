package com.wit.LibrarySystem.entity;

import com.wit.LibrarySystem.enums.GenderTypes;

abstract class Users {
    private Long identity;
    public String name;
    private String surName;
    private GenderTypes genderTypes;

    public Users(Long identity, String name, String surName, GenderTypes genderTypes) {
        this.identity = identity;
        this.name = name;
        this.surName = surName;
        this.genderTypes = genderTypes;
    }

    public boolean isUserLogIn(){
        return false;
    }

    public boolean isUserLogOut(){
        return false;
    }

    public abstract void showDetails();

    @Override
    public String toString() {
        return "Users{" +
                "identity: " + identity +
                ", Name: " + name + '\'' +
                ", SurName: " + surName + '\'' +
                ", Gender: " + genderTypes +
                '}';
    }
}
