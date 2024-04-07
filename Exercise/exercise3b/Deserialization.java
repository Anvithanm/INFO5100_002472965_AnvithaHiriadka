package com.Exercise.exercise3b;
/*
This is Deserialization class.
Deserialized from shape_types.ser and printed the required fields from Exercise2
 */
import com.Exercise.exercise2.Shape;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String args[]){
        Shape shape_circle = null;
        Shape shape_square = null;
        Shape shape_rectangle = null;
        Shape shape_triangle = null;
        try{
            FileInputStream fileIn = new FileInputStream("shape_types.ser");
            ObjectInputStream In = new ObjectInputStream(fileIn);
            shape_circle = (Shape) In.readObject();
            shape_square = (Shape) In.readObject();
            shape_rectangle = (Shape) In.readObject();
            shape_triangle = (Shape) In.readObject();
            In.close();
            fileIn.close();
        }
        catch (IOException i){
            i.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserializing the shapes element:");
        System.out.printf("Shape : " +shape_circle.get_shape()+"\n");
        System.out.println("Color of the shape:"+ shape_circle.color);
        System.out.printf("Shape : " +shape_square.get_shape()+"\n");
        System.out.println("Color of the shape:"+ shape_square.color);
        System.out.printf("Shape : " +shape_rectangle.get_shape()+"\n");
        System.out.println("Color of the shape:"+ shape_rectangle.color);
        System.out.printf("Shape : " +shape_triangle.get_shape()+"\n");
        System.out.println("Color of the shape:"+ shape_triangle.color);
    }
}
