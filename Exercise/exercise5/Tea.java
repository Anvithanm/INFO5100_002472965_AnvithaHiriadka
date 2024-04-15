package com.Exercise.exercise5;
//Concrete class implementing Interface Beverages
public class Tea implements Beverages{
    public void prepare_beverage(){
        System.out.println("Beverage : Steeping Tea");
    }

    public void zero_sugar_beverage(){
        System.out.println("Zero Sugar beverage : Brewing Tea with zero sugar");
    }

}
