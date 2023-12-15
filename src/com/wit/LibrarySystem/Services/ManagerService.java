package com.wit.LibrarySystem.Services;
import com.wit.LibrarySystem.entity.Members;

public interface ManagerService {
    void addMember(Members member);
    boolean authenticateMember(String memberId, String password);
    void deleteMember(int memberId);
}
