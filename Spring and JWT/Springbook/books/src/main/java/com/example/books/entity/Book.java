package com.example.books.entity;

 

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

 

@Entity

@Table(name="BookTable")

public class Book {

 

        @Id

        @Column(name="id")

        private int id;

 

        @Column(name="bookname")

        private String bookName;

 

        @Column(name="author")

        private String bookAuthor;

 

        public Book(){

           

        }

 

        public Book(int id, String bookName, String bookAuthor) {

            this.id = id;

            this.bookName = bookName;

            this.bookAuthor = bookAuthor;

        }

 

        public int getId() {

            return id;

        }

 

        public void setId(int id) {

            this.id = id;

        }

 

        public String getBookName() {

            return bookName;

        }

 

        public void setBookName(String bookName) {

            this.bookName = bookName;

        }

 

        public String getBookAuthor() {

            return bookAuthor;

        }

 

        public void setBookAuthor(String bookAuthor) {

            this.bookAuthor = bookAuthor;

        }

 

        @Override

        public String toString() {

            return "Book [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";

        }

 

       

 

   

   

   

}