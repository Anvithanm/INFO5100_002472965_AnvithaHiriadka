package com.Exercise.exercise5;
/*
This is part of the Factory Method Design Pattern
BeverageFactory class - Creating a factory to generate object of the concrete classes
 */
public class BeverageFactory {
    //Using getBeverage method to object of Type of Beverage
    public Beverages getBeverage(String BeverageType){
        if(BeverageType == null){
            return null;
        }
        if (BeverageType.equalsIgnoreCase("COFFEE")){
            return new Coffee();
        }
        else if (BeverageType.equalsIgnoreCase("SMOOTHIE")) {
            return new Smoothie();
        }
        else if (BeverageType.equalsIgnoreCase("TEA")) {
            return new Tea();
        }
        return null;
    }
}
