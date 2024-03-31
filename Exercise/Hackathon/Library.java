package com.Exercise.Hackathon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/*Library class implements serialization
This class contains following methods :
- add_book
- removing_book
- search_book
- searchByISBN -->(Searching book by ISBN)
- getAvailableBooks
- checkoutBook
- returnBook
*/
public class Library implements Serializable {
    //Creating a list to store books in the library
    static List<Books> bookslist;
    //Constructor to initialize the books in the library
    public Library(){
        bookslist =  new ArrayList<>();
    }
    //Defining the method to add book
    public static void add_book(Books book){
        bookslist.add(book);
    }
    //Defining the method for removing book
    public static void removing_book(Books book) {
        bookslist.remove(book);
    }
    //Defining the method for searching a book by title, author, or genre
    public static List<Books> search_book(String keyword) {
        List<Books> result = new ArrayList<>();
        for (Books book : bookslist) {
            if (book.title.contains(keyword) ||
                    book.author.contains(keyword) ||
                    book.genre.contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }
    //Defining a method to find a book by ISBN (used while checking out the book)
    public static List<Books> searchByISBN(String ISBN) {
        List<Books> result = new ArrayList<>();
        for (Books book : bookslist) {
            if (book.ISBN.equals(ISBN)) {
                result.add(book);
            }
        }
        return result;
    }
    //Defining the method to display all available books
    public static List<Books> getAvailableBooks() {
        List<Books> result = new ArrayList<>();
        for (Books book : bookslist) {
            if (book.availability) {
                result.add(book);
            }
        }
        return result;
    }
    //Defining the method for checking out a book (marking it as unavailable)
    public static void checkoutBook(Books book) {
        book.availability = false;
    }
    //Defining the method for returning a book (marking it as available again)
    public static void returnBook(Books book) {
        book.availability = true;
    }
}
