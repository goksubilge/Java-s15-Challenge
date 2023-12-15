package com.wit.LibrarySystem.entity;

import com.wit.LibrarySystem.Services.MemberService;
import com.wit.LibrarySystem.enums.GenderTypes;
import com.wit.LibrarySystem.enums.MemberTypes;

import java.util.Date;
import java.util.List;

public class Members extends Users implements MemberService {
    private int memberId;
    private int age;
    private String password;
    private Date subscribeDate;
    private MemberTypes memberTypes;
    private List<Books> currentBookList;

    public int getMemberId() {return memberId;}
    public void setMemberId(int memberId) {this.memberId = memberId;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public Date getSubscribeDate() {return subscribeDate;}
    public void setSubscribeDate(Date subscribeDate) {this.subscribeDate = subscribeDate;}
    public MemberTypes getMemberTypes() {return memberTypes;}
    public void setMemberTypes(MemberTypes memberTypes) {this.memberTypes = memberTypes;}
    public List<Books> getCurrentBookList() {return currentBookList;}
    public void setCurrentBookList(List<Books> currentBookList) {this.currentBookList = currentBookList;}

    public Members(int memberId,Long identity, String name, String surName, GenderTypes genderTypes, int age, String password, Date subscribeDate, MemberTypes memberTypes, List<Books> currentBookList) {
        super(identity, name, surName, genderTypes);
        this.memberId = memberId;
        this.age = age;
        this.password = password;
        this.subscribeDate = subscribeDate;
        this.memberTypes = memberTypes;
        this.currentBookList = currentBookList;
    }

/*    public void borrowBook(List<Books> currentBookList, MemberTypes memberType){
        if(memberType == MemberTypes.STUDENT){
            currentBookList.add()
        }
        showDetails();
    }*/

    @Override
    public boolean isUserLogIn() {
        System.out.println("Welcome " + getMemberTypes().name() + " : " + this.name);
        return super.isUserLogIn();
    }

    @Override
    public boolean isUserLogOut() {
        System.out.println("Bye bye " + getMemberTypes().name() + " : " + this.name);
        return super.isUserLogOut();
    }

    @Override
    public void showDetails() {
        String builderPFS = super.toString();
        StringBuilder builderMembers = new StringBuilder();
        builderMembers.append("****** Member Details *******\n");
        builderMembers.append("MemberId: " + memberId + "\n");
        builderMembers.append("Age: " + age + "\n");
        builderMembers.append("Subscribe date: " + subscribeDate + "\n");
        builderMembers.append("Member type: " + memberTypes + "\n");
        builderMembers.append("Current book list: " + currentBookList + "\n");
        builderMembers.append("********************************\n");
        System.out.println(builderPFS + builderMembers.toString());
    }

    @Override
    public void borrowBook(Members member, Books book) {
        // TODO
    }

    @Override
    public void returnBook(Members member, Books book) {
        // TODO
    }
}
