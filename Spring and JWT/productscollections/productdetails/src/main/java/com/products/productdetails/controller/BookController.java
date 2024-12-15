package com.products.productdetails.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productdetails.model.Book;
import com.products.productdetails.service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
// @RequestMapping("/")
public class BookController {
    @Autowired
    private BookService bs;
    
    @GetMapping("Book")
    public List<Book> getMethodName() {
        return  bs.getAllBooks();
    }

    @PostMapping("Book")
    public String createBook(@RequestBody Book b) { 
        return bs.createBook(b);
    }

    @DeleteMapping("Book")
    public String deleteBook(@RequestParam("ID") String id){
        return bs.deleteBook(id);
    }

    
    

}
