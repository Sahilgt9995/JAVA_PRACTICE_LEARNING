package com.example.demo;

public class book {
    private String BookID;
    private String BookName;
    private String BookAuthor;
    public book(String bookID, String bookName, String bookAuthor) {
        BookID = bookID;
        BookName = bookName;
        BookAuthor = bookAuthor;
    }
    public String getBookID() {
        return BookID;
    }
    public void setBookID(String bookID) {
        BookID = bookID;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public String getBookAuthor() {
        return BookAuthor;
    }
    @Override
    public String toString() {
        return "book [BookID=" + BookID + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + "]";
    }
    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }
    
}
