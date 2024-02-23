package com.Exercise.exercise1;
/*
Student class - Super/Parent class
*/
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Student {
    String[] student_name;
    int total_student;
    int pt_count;
    int ft_count;
    String[] part_time_students;
    String[] full_time_students;
    String student_type;
    Collection<int[]> score;
    HashMap<String, int[]> ft_students_exams;
    //Constructor for part time students
    public Student(Set<String> name, Collection<int[]> score, String type, int pt_count){
        total_student = 20;
        this.pt_count = pt_count;
        ft_count = total_student-pt_count;
        student_name = name.toArray(new String[0]);
        part_time_students = new String[pt_count];
        full_time_students = new String[ft_count];
        part_time_students = Arrays.copyOfRange(student_name,0,pt_count);
        full_time_students = Arrays.copyOfRange(student_name, pt_count, total_student);
        this.score = score;
        student_type = type;
    }
    //Constructor for Full time students with their exam scores
    public Student(HashMap<String, int[]> ft_students_exams, String type){
        this.ft_students_exams = ft_students_exams;
        student_type = type;
    }
}



