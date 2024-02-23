package com.Exercise.exercise1;
/*
Full time student class derived from the Students class
This class contains a public method to print exam scores of full-time students
*/
import java.util.Arrays;
import java.util.HashMap;
class Full_time_student extends Student {
    public Full_time_student(HashMap<String, int[]> ft_students_exams, String type) {
        super(ft_students_exams, type);
    }
    public void ft_students_exam_scores() {
        for (String key : ft_students_exams.keySet()) {
            System.out.println("Exam Score of Full time student " +key+ ": " + Arrays.toString(ft_students_exams.get(key)));
        }
    }
}