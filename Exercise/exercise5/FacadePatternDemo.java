package com.Exercise.exercise5;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 04/14/2024
========================================================================================================================
This class consists of program to demonstrate the use of Structural Design Pattern -  Facade Pattern
Beverages.java --> Interface
Coffee.java, Smoothie.java, Tea.java --> Concrete classes implements the Beverage Interface
BeverageMaker.java --> Facade class --> To to delegate user calls to concrete classes
FacadePatternDemo.java --> This class uses BeverageMaker to show th result
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        System.out.println("Facade Design Pattern(Structural Design Pattern)!!!!");
        System.out.println("****************************************************");
        BeverageMaker make_beverage = new BeverageMaker();
        make_beverage.prepare_zero_sugar_coffee();
        make_beverage.prepare_zero_sugar_smoothie();
        make_beverage.prepare_zero_sugar_tea();
        System.out.println("****************************************************");
    }
}
