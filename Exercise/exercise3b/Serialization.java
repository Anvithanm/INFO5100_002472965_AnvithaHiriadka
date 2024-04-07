package com.Exercise.exercise3b;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 04/07/2024
========================================================================================================================
 Exercise3B package consists of Serialization and Deserialization class.
 Here Serialization and Deserialization is performed for the objects created in Exercise2
 The below code consists of code for Serialization
 The objects are serialized and stored in shape_types.ser
 */
import com.Exercise.exercise2.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String args[]){
        Shape shape_circle = new Circle("Circle",5.0F);
        Shape shape_square = new Square("Square", 3.4F);
        Shape shape_rectangle = new Rectangle("Rectangle", 3.0F, 9.3F);
        Shape shape_triangle = new Triangle("Triangle", 6.0F, 3.1F,  5.9F);
        //Circle class[extended class of shape]
        shape_circle.color = "Yellow";
        //Square class[extended class of shape]
        shape_square.color = "Blue";
        //Rectangle class[extended class of shape]
        shape_rectangle.color = "Red";
        //Triangle class[extended class of shape]
        shape_triangle.color = "Green";

        try{
            FileOutputStream fileout = new FileOutputStream("shape_types.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(shape_circle);
            out.writeObject(shape_square);
            out.writeObject(shape_rectangle);
            out.writeObject(shape_triangle);
            out.close();
            fileout.close();
            System.out.println("Serialized object is stored in /Users/anvithahiriadka/IdeaProjects/HelloWorld/shape_types.ser");
        }
        catch (IOException i){
            i.printStackTrace();
        }
    }
}
