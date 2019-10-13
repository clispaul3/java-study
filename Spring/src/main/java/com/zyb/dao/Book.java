package com.zyb.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("book01")
@Scope(value = "prototype")
public class Book {
    private String bookName;
    private String author;
    public void save(){
        System.out.println("Book is saving...");
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
