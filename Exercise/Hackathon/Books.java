package com.Exercise.Hackathon;
import java.io.Serializable;

//Book class Implements Serialization
public class Books implements Serializable {
    String title;
    String author;
    String genre;
    String ISBN;
    boolean availability;
    //Book attributes
    public Books(String book_title, String book_author, String book_genre, String book_ISBN, boolean b) {
        title = book_title;
        author = book_author;
        genre = book_genre;
        ISBN = book_ISBN;
        availability = true;
    }
}
