package com.Exercise.exercise2;
/* Child class extended from abstract class Shape
 */
public class Rectangle extends Shape{
    float length;
    float width;
    public Rectangle(String shape, float length, float width) {
        super(shape);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculate_area() {
        area = length * width;
        System.out.println("The area of "+get_shape()+" = "+ area);
    }
    @Override
    public void calculate_perimeter() {
        perimeter = 2 * (length + width);
        System.out.println("The perimeter of "+get_shape()+" = "+perimeter);
    }
}
