//package Collections1;
//import java.util.*;
//
//class book {
//    String isbn;
//    String bookName;
//    String author;
//
//    public book(String isbn,String bookName,String author){
//        this.isbn=isbn;
//        this.bookName=bookName;
//        this.author=author;
//    }
//
//    public void bookDetails(){
//        System.out.println("BookName --> "+ bookName);
//        System.out.println("isbn --> "+ isbn);
//        System.out.println("Author --> "+ author);
//
//    }
//
//
//}
//class Category {
//    int c_ID;
//    String c_Name;
//    List<book> bkList;
//
//    public Category(int cID, String cName, List<book> a) {
//        this.c_ID = cID;
//        this.c_Name = cName;
//        this.bkList.add(new ArrayList<>());
//
//    }
//
//}
//public class bookStore{
//    public static void main(String[] args) {
//        book b1 = new book("1234", "Learn Java", "Tejas");
//        book b2 = new book("1233", "Learn Java", "Shubham");
//        book b3 = new book("1533", "Learn Java", "kunal");
//
//        List<book> bookList = new ArrayList<>();
//
//
//
//        bookList.add(b1);
//        bookList.add(b2);
//        bookList.add(b3);
//        bookList.add(new book("2314", "Learn C", "Faizan"));
//        //bookList.add(new book("2994", "Learn C", "Faizan"));
//
//        List<Category> category = new ArrayList<Category>(23,"Education",bookList);
//
//        for(int i=0;i<bookList.size();i++){
//            book obj1 = bookList.get(i);
//            obj1.bookDetails();
//        }
//
//}