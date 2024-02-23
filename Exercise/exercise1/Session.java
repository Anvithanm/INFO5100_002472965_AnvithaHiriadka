package com.Exercise.exercise1;
/*
Session Class
This class contains :
- A public method to calculate average quiz scores per student for the whole class
- A public method to print the list of quiz scores in ascending order for one session
*/
import java.util.*;
public class Session {
    HashMap<String, int[]> name_score;
    public Session(HashMap<String, int[]> name_score){
        this.name_score = name_score;
    }
    public void average_quiz_score(){
        for (String key : name_score.keySet()){
            int[] temp_array = name_score.get(key);
            int length = temp_array.length;
            int sum =0;
            for (int i : temp_array) {
                sum += i;
            }
            float average =  (float) sum / length;
            System.out.println("Average quiz score of student "+key+" : "+String.format("%.2f",average));
        }
    }
    public void quiz_score_per_session_sort(int session_no){
        ArrayList <Integer> sort_array = new ArrayList<Integer>();
        for (String key : name_score.keySet()) {
                int[] temp_array = name_score.get(key);
                sort_array.add(temp_array[session_no - 1]);
        }
        Collections.sort(sort_array);
        System.out.println("List of Quiz Scores in ascending order for session number " + session_no + " is: " + sort_array);
    }
    public void quiz_score_sort_per_student(){
        for (String key: name_score.keySet()){
            int[] temp_array =  name_score.get(key);
            Arrays.sort(temp_array);
            System.out.println("Sorted quiz score for each student: "+key+": "+Arrays.toString(temp_array));
        }
    }
}
