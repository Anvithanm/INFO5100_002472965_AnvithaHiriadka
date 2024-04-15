package com.Exercise.exercise5;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 04/14/2024
========================================================================================================================
This class consists of program to demonstrate the use of Behavioral Design Pattern -  Iterator Pattern
Iterator.java --> Iterator Interface
Container.java --> Container Interface - Returns the Iterator
SnackRepository.java --> A concrete class implementing the Container interface.
    SnackIterator --> Inner class [within "SnackRepository.java"] - implements the Iterator Interface
IteratorPatternDemo.java --> This class creates a SnackRepository object.
    It uses its iterator to iterate over the snacks and print their names.
 */
public class IteratorPatternDemo {
    public static void main(String [] args){
        SnackRepository snack_repo = new SnackRepository();
        System.out.println("Iterator Design Pattern(Behavioral Design Pattern)!!!!");
        System.out.println("******************************************************");
        for(Iterator iter = snack_repo.getIterator(); iter.hasNext();){
            String snack = (String) iter.Next();
            System.out.println("Snack : " + snack);
        }
        System.out.println("******************************************************");
    }
}
