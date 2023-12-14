package com.wit.LibrarySystem.entity;

import com.wit.LibrarySystem.enums.GenderTypes;
import com.wit.LibrarySystem.enums.MemberTypes;

import java.util.Date;

public class Members extends Users {
    private int age;
    private String password;
    private Date subscribeDate;
    private MemberTypes memberTypes;

    public Members(Long identity, String name, String surName, GenderTypes genderTypes, int age, String password, Date subscribeDate, MemberTypes memberTypes) {
        super(identity, name, surName, genderTypes);
        this.age = age;
        this.password = password;
        this.subscribeDate = subscribeDate;
        this.memberTypes = memberTypes;
    }
}
