package com.Exercise.exercise8;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 04/07/2024
========================================================================================================================
Exercise8
This is Java Program to parse the JSON document
The json file contains three book entries

It also contains a code for adding a additional entry to the Book element
and the entire JSON file is parsed and re-printed again to confirm the update
*/
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

public class Java_json_parser {
    static String file_path = "/Users/anvithahiriadka/IdeaProjects/HelloWorld/src/com/Exercise/exercise8/Book_details.json";
    //Method to parse and print the json file in Java
    public void json_parser_and_print_elements(){
        try{
            JSONParser parser = new JSONParser();
            //Parsing the JSON file
            Object obj = parser.parse(new FileReader(file_path));
            //Converting the parsed object into JSON Object
            JSONObject jsonobject = (JSONObject)obj;
            //Accessing the bookshelf array
            JSONArray bookshelf_array = (JSONArray)jsonobject.get("Bookshelf");
            for (Object book_shelf : bookshelf_array){
                JSONObject bookshelf = (JSONObject)book_shelf;
                JSONArray books = (JSONArray)bookshelf.get("Book");
                //Iterating through each item in the array of book
                for (Object book: books){
                    JSONObject elements = (JSONObject)book;
                    //Printing the book element contents
                    System.out.println("Current element : Book");
                    System.out.println("Book Title : "+elements.get("Title"));
                    System.out.println("Year of Publication : "+elements.get("Published_year"));
                    System.out.println("Number of Pages : "+elements.get("NumberofPages"));
                    System.out.println("Author : "+elements.get("Author"));
                    System.out.println("\n");
                }
            }
        } catch (ParseException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException, ParseException {
        //Parsing the Json file and printing the json data contents
        Java_json_parser json_parse_print = new Java_json_parser();
        System.out.println("Parsing and Printing the JSON file elements");
        System.out.println("-------------------------------------------");
        json_parse_print.json_parser_and_print_elements();
        //Reading the existing Json file
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(file_path));
        JSONObject json_object = (JSONObject)obj;
        JSONArray book_Shelf_array =(JSONArray)json_object.get("Bookshelf");
        JSONObject bookshelfobj = (JSONObject) book_Shelf_array.get(0);
        JSONArray book_array = (JSONArray) bookshelfobj.get("Book");
        JSONObject new_book = new JSONObject();
        new_book.put("Title","Julius Caesar");
        new_book.put("Published_year",2008);
        new_book.put("NumberofPages",416);
        new_book.put("Author", "Philip Freeman");
        book_array.add(new_book);
        json_object.put("Bookshelf", book_Shelf_array);
        //Writing the new book sub elements back to the file
        FileWriter write_to_file = new FileWriter(file_path);
        write_to_file.write(json_object.toJSONString());
        write_to_file.flush();
        write_to_file.close();
        System.out.println("New book successfully added to existing Json file!!!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Parsing and reprinting the Json file to check the new book addition!!!");
        json_parse_print.json_parser_and_print_elements();
    }
}
