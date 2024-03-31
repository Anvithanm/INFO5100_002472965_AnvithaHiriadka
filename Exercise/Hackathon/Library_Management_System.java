package com.Exercise.Hackathon;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 03/30/2024
Java Hackathon exercise - Library Management System
This package contains
- Library Management System [Main java code]
- Library class [feature methods]
- Books [attributes for books]
- User Authentication System
========================================================================================================================
This file contains main class(named as class Library_Management_System) to demonstrate the functionality of
Library Management System
This has the objects defined for Library class for performing following operations
adding books, removing book, searching for books, displaying available books, checking out books, and returning books.
Also in this Library system, I have pre loaded 2 books.

Important Note :
This library Management System requires User Authentication.
Please use any of the below credentials
Username as : user1 and Password = password123   or
Username as : user2 and Password = password123
 */
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Library_Management_System {
    public static void main(String[] args) {
        User_Authentication log_in = new User_Authentication();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library Management System");
        System.out.println("Enter your  credentials to log in");
        while (true){
            System.out.println("Enter the User Name :");
            String Username = scanner.nextLine();
            System.out.println("Enter the Password :");
            String Password = scanner.nextLine();
            if (log_in.authenticateUser(Username, Password)){
                System.out.println("User log-In Successful");
                break;
            }
            else{
                System.out.println("Incorrect Username or Password. Try Again!");
            }
        }
        Library library = loadingLibrary();
        //Pre-Loading few of the books to the library
        Books book1 = new Books("IKIGAI", "Hector Garcia and Francesc Miralles", "Mindfullness", "9780143130727", true);
        Books book2 = new Books("The Book of Doors", "Gareth Brown", "Fiction", "9798212898447", true);
        Library.add_book(book1);
        Library.add_book(book2);
        //Scanner scanner = new Scanner(System.in);
        //Library management system features
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Search a Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Checkout Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            //Using switch statement for different feature choices
            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = scanner.nextLine();
                    Library.add_book(new Books(title, author, genre, isbn, true));
                    break;
                case 2:
                    System.out.print("Enter the name of the book to remove: ");
                    String remove_book = scanner.nextLine();
                    List<Books> removeResults = Library.search_book(remove_book);
                    if (!removeResults.isEmpty()) {
                        Library.removing_book(removeResults.getFirst());
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter search keyword: ");
                    String keyword = scanner.nextLine();
                    List<Books> searchResults = Library.search_book(keyword);
                    if (!searchResults.isEmpty()) {
                        for (Books book : searchResults) {
                            System.out.println("Book found : \n");
                            System.out.println("Book Name : "+ book.title + " | Author : " + book.author+" |" + " ISBN : "+book.ISBN);
                        }
                    } else {
                        System.out.println("No books found.");
                    }
                    break;
                case 4:
                    List<Books> availableBooks = Library.getAvailableBooks();
                    if (!availableBooks.isEmpty()) {
                        System.out.println("\n The available books are : \n");
                        for (Books book : availableBooks) {
                            System.out.println("Book Name : "+ book.title + " | Author : " + book.author+" |" + " ISBN : "+book.ISBN);
                        }
                    } else {
                        System.out.println("There are no books available currently");
                    }
                    break;
                case 5:
                    System.out.print("Enter ISBN of the book to checkout: ");
                    String checkoutISBN = scanner.nextLine();
                    List<Books> checkoutResults = Library.searchByISBN(checkoutISBN);
                    if (!checkoutResults.isEmpty()) {
                        for (Books book : checkoutResults) {
                            if (book.availability) {
                                Library.checkoutBook(checkoutResults.getFirst());
                                System.out.println("Book is checked out successfully.");
                            } else {
                                System.out.println("Currently Book is not available");
                            }
                        }
                    }
                    else{
                        System.out.println("Book not found");
                    }
                    break;
                case 6:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    List<Books> returnResults = Library.searchByISBN(returnISBN);
                    if (!returnResults.isEmpty()) {
                        for (Books book : returnResults) {
                            if (book.availability == false) {
                                Library.returnBook(returnResults.getFirst());
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book return is already completed");
                            }
                        }
                    }
                    else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 7:
                    saveLibrary(library);
                    System.out.println("Exit from Library Management System");
                    System.exit(0);
                default:
                    System.out.println("Invalid feature choice.");
            }
        }
    }
    //Save library method
    private static void saveLibrary(Library library) {
        // Serialization - library object is serialized here
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.ser"))) {
            oos.writeObject(library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Loading library module
    private static Library loadingLibrary() {
        Library library_system = new Library();
        //Deserialization - serialized object is read from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("library.ser"))) {
            Object obj = ois.readObject();
            if (obj instanceof Library) {
                library_system = (Library) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            // File does not exist or is empty, returns empty library
        }
        return library_system;
    }
}