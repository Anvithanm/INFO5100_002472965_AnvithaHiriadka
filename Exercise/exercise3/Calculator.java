package com.Exercise.exercise3;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 03/09/2024
========================================================================================================================
This file contains the Javafx content for the creation of an Rich Internet Application for a Simple Calculator.
This Simple Calculator supports four functions that is Addition, Subtraction, Multiplication and Division.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import java.io.IOException;

public class Calculator extends Application {
        String [] buttons = {"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
        //static String [] operators = {"+","-","*","/"};
        static int col = 0;
        static int row = 0;
        @Override
        public void start(Stage stage) throws IOException {
            // Creating the heading for the  application calculator
            Text heading = new Text("Simple Calculator");
            heading.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
            heading.setX(160);
            heading.setY(50);
            //Creating the labels for the fields input and output
            Text input = new Text("Input");
            input.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
            Text output = new Text("Output");
            output.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
            // Creating the input field and output field
            TextField input_field = new TextField();
            input_field.setEditable(false);
            TextField output_field = new TextField();
            output_field.setEditable(false);
            // Creating button clear
            Button clear = new Button("Clear");
            GridPane gridpane = new GridPane();
            //Setting the size of the grid pane layout
            gridpane.setMinSize(200, 200);
            //Padding the layout
            gridpane.setPadding(new Insets(20,20,20,20));
            //Setting vertical and horizontal gaps between the columns
            gridpane.setVgap(20);
            gridpane.setHgap(20);
            gridpane.add(heading,0,0);
            gridpane.add(input,0,1);
            gridpane.add(input_field,1,1,2,1);
            gridpane.add(output, 0,2);
            gridpane.add(output_field,1,2,2,1);
            gridpane.add(clear, 3,2);
            //Setting the action for clear button
            clear.setOnAction(e->{
                input_field.setText("");
                output_field.setText("");
            });
            //Adding digit buttons into the Grid pane, setting the button action and button operation
            GridPane button_box = new GridPane();
            button_box.setMinSize(100, 100);
            button_box.setPadding(new Insets(0,5,0,5));
            button_box.setVgap(10);
            button_box.setHgap(10);
            for(String num :buttons){
                Button num_button = new Button(num);
                if(num!="=") {
                    num_button.setOnAction(e -> input_field.appendText(num));
                }
                else{
                    num_button.setOnAction(e-> {
                    String expression = input_field.getText();
                    double result = Event_control.calculate(expression);
                    output_field.setText(String.valueOf(result));
                });
                }
                num_button.setPrefSize(50, 50);
                button_box.add(num_button,col,row);
                col++;
                if(col>3){
                    col=0;
                    row++;
                }
            }
            gridpane.add(button_box,1,3,2,6);
            Scene scene = new Scene(gridpane);
            stage.setTitle("Four Function Calculator");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
