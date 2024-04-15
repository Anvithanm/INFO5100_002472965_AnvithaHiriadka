package com.Exercise.exercise5;
/*
This is part of Facade Design Pattern
BeverageMaker is a Facade Class.
This class uses the concrete classes(Coffee.java, Smoothie.java, Tea.java) to delegate user calls to these classes.
 */
public class BeverageMaker {
    private Beverages coffee;
    private Beverages smoothie;
    private Beverages tea;
    public BeverageMaker(){
        coffee = new Coffee();
        smoothie = new Smoothie();
        tea = new Tea();
    }
    public void  prepare_zero_sugar_coffee(){
        coffee.zero_sugar_beverage();
    }
    public void  prepare_zero_sugar_smoothie(){
        smoothie.zero_sugar_beverage();
    }
    public void  prepare_zero_sugar_tea(){
        tea.zero_sugar_beverage();
    }
}
