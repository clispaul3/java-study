package com.zyb.service;

import com.zyb.dao.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IService {
    @Autowired
    private Book book;
    public void saveBook(){
        this.book.save();
        System.out.println("BookServcie is saving");
    }
    @Autowired
    public void show(Book book){
        System.out.println("BookService book method...");
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "book=" + book +
                '}';
    }
}
