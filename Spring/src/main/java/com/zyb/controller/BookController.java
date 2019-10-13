package com.zyb.controller;

import com.zyb.service.BookService;
import com.zyb.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @Qualifier("bookService")
    @Autowired
    private IService noteService;
    public void doGet(){
        noteService.saveBook();
    }
}
