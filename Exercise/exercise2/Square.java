package com.Exercise.exercise2;
/* Child class extended from abstract class Shape
 */
public class Square extends Shape{
    float side_value;
    public Square(String shape, float side_value) {
        super(shape);
        this.side_value = side_value;
    }

    @Override
    public void calculate_area() {
        area = side_value * side_value;
        System.out.println("The area of "+get_shape()+" = "+ area);
    }
    @Override
    public void calculate_perimeter(){
    perimeter = 4*side_value;
    System.out.println("The perimeter of "+get_shape()+" = "+perimeter);
    }
}
