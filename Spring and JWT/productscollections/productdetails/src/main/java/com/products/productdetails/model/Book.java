package com.products.productdetails.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="BookTable")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    @Column(name="ID")
    private String id;

    @Column(name="BOOKNAME")
    private String bookName;

    @Column(name="AUTHOR")
    private String authorName;

    public Book() {
    }
    
    public Book(String id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // public String getId() {
    //     return id;
    // }

    // public void setId(String id) {
    //     this.id = id;
    // }

    // public String getBookName() {
    //     return bookName;
    // }

    // public void setBookName(String bookName) {
    //     this.bookName = bookName;
    // }

    // public String getAuthorName() {
    //     return authorName;
    // }

    // public void setAuthorName(String authorName) {
    //     this.authorName = authorName;
    // }

    @Override
    public String toString() {
        return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + "]";
    }
    
}
