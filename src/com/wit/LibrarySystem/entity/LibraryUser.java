package com.wit.LibrarySystem.entity;

import com.wit.LibrarySystem.enums.GenderTypes;

public class LibraryUser extends Users {
    private int processCount;

    public LibraryUser(Long identity, String name, String surName, GenderTypes genderTypes) {
        super(identity, name, surName, genderTypes);
        this.processCount = 0;
    }

    public int getProcessCount() {return processCount;}
    public void setProcessCount() {this.processCount = processCount + 1;}


    @Override
    public boolean isUserLogIn() {
        System.out.println("Hello Librarian: " + this.name);
        return super.isUserLogIn();}

    @Override
    public boolean isUserLogOut() {
        System.out.println("Bye bye Librarian: " + this.name);
        return super.isUserLogOut();}

    @Override
    public void showDetails() {
        String builderPFS = super.toString();
        StringBuilder builderLibraryUser = new StringBuilder();
        builderLibraryUser.append("****** Librarian Details *******\n");
        builderLibraryUser.append("Process Count: " + processCount +"\n");
        builderLibraryUser.append("********************************\n");
        System.out.println(builderPFS + builderLibraryUser.toString());
    }
}
