package com.Exercise.exercise0;

public class Car_driving_system {
    byte acceleration;
    byte braking_power;
    String driving_mode;
    String power_state;
    byte min_speed;
    byte max_speed;
    String suspension_type;
    String gear_value;
    public Car_driving_system(String power, String mode, String gear, byte accelerate, byte decelerate, String type){
        power_state = power;
        driving_mode = mode;
        gear_value = gear;
        acceleration = accelerate;
        braking_power = decelerate;
        min_speed = 25;
        max_speed = 55;
        suspension_type = type;
        System.out.println("The car transmission mode is set to: "+driving_mode+ " and the suspension type is: "+ suspension_type);
    }
    public void setAcceleration(){
        System.out.println("Accelerating the car");
    }
    public void setBraking_power(){
        System.out.println("Decelerating the car");
    }
    public void change_transmission_mode(){
        System.out.println("Transmission mode is changed to: " +driving_mode);
    }
}
