package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.book;
import com.example.demo.service.bookService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/SahilBookStore")
public class bookController {
    public bookService bs = new bookService(); 

    List<book> booklist = new ArrayList<>();

    @GetMapping("inventory")
    public List<book> getAllBooks() {
        return bs.printList();
    }

    @PostMapping("AddEntry")
    public String addBook(@RequestParam("ID") String id, @RequestParam("NAME") String name,@RequestParam("AUTHOR") String author) {
       return bs.addBookService(id, name, author);
       
    }

    @DeleteMapping("DeleteEntry")
    public String deleteBook(@RequestParam("ID") String id){
       
        return bs.deleteBookService(id);
    }

    @PutMapping("putEntry")
    public String putMethodName(@RequestParam("ID") String id, @RequestParam("NEWNAME") String newName,@RequestParam("NEWAUTHOR") String newAuthor) {
        
        return bs.putBookService(id, newName, newAuthor);
        
    }
    
}