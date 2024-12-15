package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.book;

@Service
public class bookService {
    List<book> booklist = new ArrayList<>();
    
    @Autowired

    public List<book> printList(){
        return booklist;
    }

    public String addBookService(String id,String name, String author){
        booklist.add(new book(id, name, author));
        return "Book successfully added to the list --> " + booklist;
    }

    public String deleteBookService(String id){
        for (book book : booklist) {
            if(book.getBookID().equals(id)){
                booklist.remove(booklist.indexOf(book));
                    return "Book Removes Successfully";    
            }
        }
        return "Enter Valid ID";
        
    }
    public String putBookService(String id,String newName,String newAuthor){
        for (book book : booklist) {
            if((book.getBookID()).equals(id)){
                book.setBookName(newName);
                book.setBookAuthor(newAuthor);
                return "Data updated Successfull  --> " + booklist;
            }
        }
        return "Enter Valid ID to Update data.";
    }
}