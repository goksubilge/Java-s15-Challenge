package com.wit.LibrarySystem.Services;

import com.wit.LibrarySystem.entity.Books;
import com.wit.LibrarySystem.entity.Members;

public interface MemberService {
    void borrowBook(Members member, Books book);
    void returnBook(Members member, Books book);
}
