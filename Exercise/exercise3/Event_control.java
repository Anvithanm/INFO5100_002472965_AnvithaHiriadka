package com.Exercise.exercise3;
/*
This class contains the event control for the simple calculator
 */
public class Event_control{
    static String [] expression_parts;
    static double operand1, operand2;
    static String operator;
    //calculate method
    static double calculate(String expression){
        // Checking if the expression is empty
        if (expression == null ||expression.isEmpty()){
            return Double.NaN;
        }
        expression_parts = expression.split("(?<=\\d)(?=[+\\-*/])|(?<=[+\\-*/])(?=\\d)");
        //Checking if the expression length is 3
        if (expression_parts.length != 3){
            return Double.NaN;
        }
        try {
            operand1 = Double.parseDouble(expression_parts[0]);
            operand2 = Double.parseDouble(expression_parts[2]);
        } catch (NumberFormatException e) {
            return Double.NaN; // Return NaN if operands are not valid numbers
        }
        //Performing calculation based on the operator
        operator = expression_parts[1];
        switch (operator){
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0){
                    return operand1/operand2;
                }
                else{
                    return Double.NaN;
                }
            default:
                return Double.NaN;
        }
    }
}
