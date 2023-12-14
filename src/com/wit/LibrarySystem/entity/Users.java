package com.wit.LibrarySystem.entity;

import com.wit.LibrarySystem.enums.GenderTypes;
import com.wit.LibrarySystem.enums.MemberTypes;

import java.util.Date;

public class Users {
    private Long identity;
    private String name;
    private String surName;
    private GenderTypes genderTypes;

    public Users(Long identity, String name, String surName, GenderTypes genderTypes) {
        this.identity = identity;
        this.name = name;
        this.surName = surName;
        this.genderTypes = genderTypes;
    }

    public Long getIdentity() {return identity;}

    public void setIdentity(Long identity) {this.identity = identity;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getSurName() {return surName;}

    public void setSurName(String surName) {this.surName = surName;}

    public GenderTypes getGenderTypes() {return genderTypes;}

    public void setGenderTypes(GenderTypes genderTypes) {this.genderTypes = genderTypes;}

    @Override
    public String toString() {
        return "Users{" +
                "identity=" + identity +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", genderTypes=" + genderTypes +
                '}';
    }
}
