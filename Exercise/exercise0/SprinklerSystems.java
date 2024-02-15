package com.Exercise.exercise0;

public class SprinklerSystems {
    String power_on_off;
    String system_name;
    String Activation_status;
    byte no_sprinkler_head;
    short sprinkler_angle;
    byte coverage_radius;
    short flow_rate;
    short water_pressure;
    String activation_schedule;

    public SprinklerSystems(String power, String system, String status,String schedule){
        power_on_off = power;
        system_name = system;
        Activation_status = status;
        no_sprinkler_head = 4;
        water_pressure = 30;
        activation_schedule = schedule;
        System.out.println("The " +system_name +" is: "+Activation_status);
    }
    public SprinklerSystems(short angle, short rate){
        sprinkler_angle = angle;
        coverage_radius = 40;
        flow_rate = rate;
        System.out.println("The sprinkler head position is set to angle: "+sprinkler_angle+" and flow rate to: "+flow_rate);
    }
    public void set_power_on_off(){
        System.out.println("The Power and water system is powered: "+power_on_off);
    }
    public void activate_system(){
        System.out.println("The Sprinkler system status: "+Activation_status);
    }
    public void adjust_sprinkler(){
        System.out.println("The Sprinkler head position is adjusted to angle: "+sprinkler_angle+"and flow rate to: "+flow_rate);
    }
}