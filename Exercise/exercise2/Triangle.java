package com.Exercise.exercise2;
/* Child class extended from abstract class Shape
 */
public class Triangle extends Shape{
    float side1;
    float side2;
    float side3;
    public Triangle(String shape, float side1, float side2,float side3) {
        super(shape);
        this.side1 = side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public void calculate_area() {
        float x = (side1 + side2 + side3)/2;
        area = (float) Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
        System.out.println("The area of "+get_shape()+" = "+ area);
    }

    @Override
    public void calculate_perimeter() {
        perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of "+get_shape()+" = "+perimeter);
    }
}
