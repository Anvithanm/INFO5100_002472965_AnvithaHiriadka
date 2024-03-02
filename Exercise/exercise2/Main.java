package com.Exercise.exercise2;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 03/01/2024
========================================================================================================================
This package includes
Shape as Parent Abstract class
Circle, Square, Rectangle, Triangle as extended child class from the Abstract class Shape
Abstraction, Polymorphism, overriding and Static field concepts are implemented.
 */
public class Main {
    public static void main(String[] args){
        Shape square_math = new Square("Square", 3.4F);
        Shape triangle_math = new Triangle("Triangle", 6.0F, 3.1F,  5.9F);
        Shape rectangle_math = new Rectangle("Rectangle", 3.0F, 9.3F);
        Shape circle_math = new Circle("Circle",5.0F);
        square_math.calculate_area();
        square_math.calculate_perimeter();
        triangle_math.calculate_area();
        triangle_math.calculate_perimeter();
        rectangle_math.calculate_area();
        rectangle_math.calculate_perimeter();
        circle_math.calculate_area();
        circle_math.calculate_perimeter();
        triangle_math.color_of_the_shape();
    }
}
