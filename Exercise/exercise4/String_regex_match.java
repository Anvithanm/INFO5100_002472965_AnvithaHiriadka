package com.Exercise.exercise4;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 03/22/2024
========================================================================================================================
 Exercise4 package consists of String_regex_match class.
 This class has 5 regular expressions patterns that demonstrates positive and negative cases
 using one subject string for each case.
 Regular expression subjects are first name & last name, Phone number, Email ID, Website URL, SSN Number
 first name & last name : Pattern matches first name and last name
 Phone number : Matches phone number in the format +1(xxx) xxx-xxx  -->[Should have US country  code]
 Email ID : Matches the email in the pattern java_project123@java.co
 Website URL : Matches the website URL that starts with either https or http
 SSN Number : Matches the SSN in the format xxx-xx-xxxx
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_regex_match {
    //String subjects
    static final String [] case_type = {"First_name and Last_name", "Phone number", "Email ID", "Website URL", "SSN Number"};
    //Regular expression patterns
    static final String [] regex_expression = { "\\w+\\s{1}\\w+",
                                                "^\\+1\\([1-9]{1}[0-9]{2}\\)\\s[0-9]{3}-{1}[0-9]{4}$",
                                                "^((?!-)[A-Za-z0-9._-](?<!-))+@[A-Za-z]+\\.[A-Za-z]{2,3}$",
                                                "^(https?)\\/\\/[^\\s/$.?#].[^\\s]*$",
                                                "^\\d{3}-\\d{2}-\\d{4}$"};
    // Positive and Negative inputs for matching with the regular expression pattern
    static final String [] [] input_strings = {{"Macy William", "Alice"},
            {"+1(234) 567-8901", "+234 567-8901"},
            {"java_project123@java.co", "---2223@java.co"},
            {"https//java-course123.com","//hello-world1233.com"},
            {"222-32-3829","2000-23-123"}};

    public void positive_case(String input) {
        System.out.println("The String : \"" +input +"\" = matches pattern");
    }
    public void negative_case(String input){
        System.out.println("The string : \""+input + "\" = does not match pattern");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        String_regex_match case_validation = new String_regex_match();
        for(int i=0;i<regex_expression.length;i++){
            int number = i+1;
            Pattern pattern_compile = Pattern.compile(regex_expression[i]);
            System.out.println("Case "+number+ " "+ case_type[i]+" Pattern : " + regex_expression[i]);
            String[] input_str = input_strings[i];
            for( String j : input_str){
                Matcher match_obj = pattern_compile.matcher(j);
                if (match_obj.matches()) {
                    case_validation.positive_case(j);
                }
                else {
                    case_validation.negative_case(j);
                }
            }
        }
    }
}
