package com.Exercise.exercise2;
/* Child class extended from abstract class Shape
 */
public class Circle extends Shape{
    float radius;
    public Circle(String shape, float radius) {
        super(shape);
        this.radius = radius;
    }

    @Override
    public void calculate_area() {
        area = (float) (Math.PI * (radius * radius));
        System.out.println("The area of "+get_shape()+" = "+ area);
    }

    @Override
    public void calculate_perimeter() {
        perimeter = (float) (Math.PI * 2 * radius);
        System.out.println("The perimeter of "+get_shape()+" = "+perimeter);
    }
}
