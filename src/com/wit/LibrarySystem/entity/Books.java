package com.wit.LibrarySystem.entity;

import com.wit.LibrarySystem.Services.BookService;
import com.wit.LibrarySystem.enums.BooksCategories;

import java.util.List;

public class Books implements BookService {
    private String id;
    private String bookName;
    private String authorFullName;
    private double price;
    private BooksCategories booksCategories;
    private boolean isTheBookAvailable;

    public Books(String id, String bookName, String authorFullName, double price, BooksCategories booksCategories, boolean isTheBookAvailable) {
        this.id = id;
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.price = price;
        this.booksCategories = booksCategories;
        this.isTheBookAvailable = isTheBookAvailable;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}
    public String getAuthorFullName() {return authorFullName;}
    public void setAuthorFullName(String authorFullName) {this.authorFullName = authorFullName;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public BooksCategories getBooksCategories() {return booksCategories;}
    public void setBooksCategories(BooksCategories booksCategories) {this.booksCategories = booksCategories;}
    public boolean isTheBookAvailable() {return isTheBookAvailable;}
    public void setTheBookAvailable(boolean theBookAvailable) {isTheBookAvailable = theBookAvailable;}

    @Override
    public String toString() {
        return "Books{" +
                "id: " + id + '\'' +
                ", bookName: " + bookName + '\'' +
                ", authorFullName: " + authorFullName + '\'' +
                ", price: " + price +
                ", booksCategories: " + booksCategories +
                '}';
    }

    @Override
    public void addBook(Books book) {
        // TODO
    }

    @Override
    public void updateBook(Books book) {
        // TODO
    }

    @Override
    public void deleteBook(int id) {
        // TODO
    }

    @Override
    public Books getBookByIdManager(String id) {
        // TODO
        return null;
    }

    @Override
    public List<Books> getBooksByBookName(String bookName) {
        // TODO
        return null;
    }

    @Override
    public List<Books> getBooksByAuthor(String authorName) {
        // TODO
        return null;
    }

    @Override
    public List<Books> getBooksByCategory(BooksCategories category) {
        // TODO
        return null;
    }

    @Override
    public List<Books> getAllBooks() {
        // TODO
        return null;
    }
}
