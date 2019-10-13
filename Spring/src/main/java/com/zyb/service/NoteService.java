package com.zyb.service;

import org.springframework.stereotype.Service;

@Service
public class NoteService implements IService {

    public void saveBook() {
        System.out.println("NoteService...");
    }
}
