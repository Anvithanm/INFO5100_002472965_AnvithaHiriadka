package com.Exercise.exercise5;
//Concrete class implementing Interface Beverages
public class Smoothie implements Beverages{
    public void prepare_beverage(){
        System.out.println("Beverage : Blending Smoothie");
    }
    public void zero_sugar_beverage(){
        System.out.println("Zero Sugar Beverage : Blending Smoothie without Sugar");
    }
}
