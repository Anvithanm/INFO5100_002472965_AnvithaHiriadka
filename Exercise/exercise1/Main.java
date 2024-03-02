package com.Exercise.exercise1;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on : 02/22/2024

========================================================================================================================
Exercise 1 Package consists of
 Student - Super class
 Part_Time_student - Derived class
 Full_time_student - Derived class
 Session - Class
 This file contains data structure initialization , instantiation of object-classes, method-calls
 Methods include -
    PT_students.part_time_students - to print names of part-time students
    FT_students.ft_students_exam_scores - to print exam scores of full-time students
    student_session.average_quiz_score - to calculate average quiz scores per student for the whole class
    student_session.quiz_score_per_session_sort - to print the list of quiz scores in ascending order for one session
    student_session.quiz_score_sort_per_student - to print the list of quiz scores in ascending order for each session
========================================================================================================================
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random rd = new Random();
        // Part-time and full-time students Linked HashMap of names and their 15 Quiz scores[name:Quiz Scores]
        LinkedHashMap<String, int[]> student_details = new LinkedHashMap<>();
        String[] part_time_names = {"Ana", "Bret", "Chris", "Dia", "Eric", "Fia", "Gia", "Hanna", "Isha", "Jake"};
        for (String i : part_time_names) {
            int[] score_array = new int[15];
            for (int j = 0; j < score_array.length; j++) {
                score_array[j] = rd.nextInt(7) + 9;
            }
            student_details.put(i, score_array);
        }
        String[] full_time_names = {"Karl", "Meena", "Neil", "Olivia", "Phil", "Quinn", "Rita", "Siya", "Tara", "Uma"};
        //Adding full time students name, quiz scores
        for (String i : full_time_names) {
            int[] ft_score_array = new int[15];
            for (int j = 0; j < ft_score_array.length; j++) {
                ft_score_array[j] = rd.nextInt(6) + 10;
            }
            student_details.put(i, ft_score_array);
        }
        //HashMap for adding exam scores exclusively for full-time students
        HashMap<String, int[]> FT_exam_scores = new HashMap<>();
        for (String i : full_time_names){
            int [] exam_array = new int[2];
            for (int j=0;j< 2;j++){
                exam_array[j] = rd.nextInt(20) +80;
            }
            FT_exam_scores.put(i,exam_array);
        }
        Part_Time_student PT_students = new Part_Time_student(student_details.keySet(), student_details.values(), "Part_time", part_time_names.length);
        PT_students.part_time_students();
        Full_time_student FT_students = new Full_time_student(FT_exam_scores, "Full_time");
        FT_students.ft_students_exam_scores();
        Session student_session = new Session(student_details);
        student_session.average_quiz_score();
        student_session.quiz_score_per_session_sort(1);
        student_session.quiz_score_sort_per_student();
    }
}
