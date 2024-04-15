package com.Exercise.exercise5;
//Concrete class implementing Interface Beverages
public class Coffee implements Beverages{
    @Override
    public void prepare_beverage() {
        System.out.println("Beverage : Brewing Coffee");
    }
    public void zero_sugar_beverage(){
        System.out.println("Zero Sugar Beverage : Brewing Cafe Mocha - Zero Sugar");
    }
}
