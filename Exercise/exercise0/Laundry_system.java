package com.Exercise.exercise0;
//Laundry system class
public class Laundry_system {
    String power_state;
    String laundry_task;
    String washing_mode;
    String load_value;
    String water_level;
    String water_temp;
    byte dryer_time;
    String wrinkle_shield;
    public Laundry_system(String power, String task, String mode, String load, String level){
        power_state=power;
        laundry_task = task;
        washing_mode = mode;
        load_value = load;
        water_level = level;
        System.out.println("The "+laundry_task+" cycle is "+power_state+" in " + mode+ " mode");
    }
    public Laundry_system(String power,String task, byte time, String shield){
        power_state = power;
        laundry_task = task;
        dryer_time = time;
        wrinkle_shield = shield;
        System.out.println("The "+laundry_task+" cycle is "+power_state+" for " + dryer_time+" minutes");
    }
    public Laundry_system(String power,String temp){
        power_state = power;
        water_temp = temp;
        System.out.println("The water supply is "+ power_state +" with temperature set as: "+ water_temp);
    }
    public void washing_on(){
        System.out.println("The washing machine is "+power_state);
    }
    public void drying_on(){
        System.out.println("The dryer is: "+power_state);
    }
    public void water_supply_power(){
        System.out.println("Water Supply: "+power_state);
    }
}
