package com.example.books.entity.Book;

import org.springframework.web.bind.annotation.RestController;

import com.example.books.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/")

public class BookController {
    @Autowired
    private BookService bs;

    @GetMapping("MyStore")
    public String CreateBook (@RequestParam String param) {
        return new String();
    }
    
}
