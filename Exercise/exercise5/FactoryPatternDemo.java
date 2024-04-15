package com.Exercise.exercise5;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 04/13/2024
========================================================================================================================
Exercise5 package consists of program to demonstrate the use of Creational Design Pattern -  Factory Method Pattern
Beverages.java --> Interface
Coffee.java, Smoothie.java, Tea.java --> Concrete classes implements the Beverage Interface
BeverageFactory.java --> Factory class --> To create the objects of concrete class
FactoryPatternDemo.java --> To get the objects of the concrete class
 */
//Getting the objects of the concrete class by passing the information type - Using Factory
public class FactoryPatternDemo {
    public static void main(String[] args){
        System.out.println("Factory Method Design Pattern(Creational Design Pattern)!!!!");
        System.out.println("************************************************************");
        BeverageFactory beverage_factory = new BeverageFactory();
        //Getting the object of the Coffee concrete class and calling its prepare_beverage method
        Beverages beverage_c = beverage_factory.getBeverage("COFFEE");
        //Calling prepare_beverage method
        beverage_c.prepare_beverage();
        //Getting the object of the Smoothie concrete class and calling its prepare_beverage method
        Beverages beverage_s = beverage_factory.getBeverage("SMOOTHIE");
        //Calling prepare_beverage method
        beverage_s.prepare_beverage();
        //Getting the object of the Tea concrete class and calling its prepare_beverage method
        Beverages beverage_t = beverage_factory.getBeverage("TEA");
        //Calling prepare_beverage method
        beverage_t.prepare_beverage();
        System.out.println("************************************************************");
    }
}
