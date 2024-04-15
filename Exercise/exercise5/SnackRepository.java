package com.Exercise.exercise5;

import java.util.ArrayList;
import java.util.List;

/*
SnackRepository is a concrete class implementing the Container interface.
SnackRepository constructor initializes a list of snacks
This also has inner class SnackIterator implementing the Iterator Interface--> to iterate over the snacks in the snack list
 */
public class SnackRepository implements Container{
    private List<String> snacks = new ArrayList<>();
    SnackRepository(){
        snacks.add("Chocolate");
        snacks.add("Pretzels");
        snacks.add("Nuts");
    }
    public Iterator getIterator(){
        return new SnackIterator();
    }
    //Inner class SnackIterator
    private class SnackIterator implements Iterator{
        int index = 0;

        @Override
        public boolean hasNext() {
            return index<snacks.size();
        }

        @Override
        public Object Next() {
            if (this.hasNext()){
                return snacks.get(index++);
            }
            return null;
        }
    }
}
