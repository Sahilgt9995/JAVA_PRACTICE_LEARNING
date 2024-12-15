package com.example.demo.service;
import com.example.demo.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class generalService {

    List<book> bookList = new ArrayList<>();
    @Autowired

    public String getWelcomeMessage(){
        return "Welcome to Sahil Book Store!! This are the books available in our bookstore"+bookList;
    }
    


}
