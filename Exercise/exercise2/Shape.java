package com.Exercise.exercise2;
/* This is a Abstract Class
*/
public abstract class Shape {
    String shape;
    static float area;
    static float perimeter;
    static String color = "Blue";

    public Shape(String shape){
        this.shape = shape;
    }
    public String get_shape(){
        return shape;
    }
    public abstract void calculate_area();

    public void calculate_perimeter(){
        System.out.println("Enter the side values of the "+shape+ "to calculate the perimeter");
    }
    public void color_of_the_shape(){
        System.out.println("The color of the shape is :"+color);
    }
}
