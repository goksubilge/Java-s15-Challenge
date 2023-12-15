package com.wit.LibrarySystem.Services;

import com.wit.LibrarySystem.entity.Books;
import com.wit.LibrarySystem.enums.BooksCategories;

import java.util.List;

public interface BookService {
    void addBook(Books book);
    void updateBook(Books book);
    void deleteBook(int id);
    Books getBookByIdManager(String id);
    List<Books> getBooksByBookName(String bookName);
    List<Books> getBooksByAuthor(String authorName);
    List<Books> getBooksByCategory(BooksCategories category);
    List<Books> getAllBooks();
}
