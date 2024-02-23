package com.Exercise.exercise1;
/*
Part-time students class derived from the Students class
This class contains a public method to print names of part-time students
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
class Part_Time_student extends Student{

    public Part_Time_student(Set<String> name, Collection<int[]> score, String type, int pt_count) {
        super(name, score,type,pt_count);
    }
    //Public method to print the names of part-time students
    public void part_time_students(){
        System.out.println("The names of the part time students are: "+ Arrays.toString(part_time_students));
    }
}