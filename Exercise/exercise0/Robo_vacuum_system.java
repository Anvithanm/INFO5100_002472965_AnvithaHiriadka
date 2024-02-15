package com.Exercise.exercise0;
public class Robo_vacuum_system {
    String vacuum_name;
    String app_id;
    String app_password;
    String power_state;
    String cleaning_mode;
    String location;
    short suction_power;
    String charging_state;
    public Robo_vacuum_system(String power, String mode, String loc, short suction){
        vacuum_name = "Shine Robo";
        app_id = "Anvitha";
        app_password = "roses93";
        power_state = power;
        cleaning_mode = mode;
        location = loc;
        suction_power = suction;
        System.out.println("Vacuum cleaner is set to location:"+location+ " with mode as:"+cleaning_mode);
    }
    public Robo_vacuum_system(String state){
        charging_state = state;
        System.out.println("Vacuum cleaner charging state:"+charging_state);
    }
    public void Connect_app_vacuum(){
        System.out.println("Application is successfully connected to vacuum: "+vacuum_name);
    }
    public void vaccum_cleaning_action(){
        System.out.println("Vacuum cleaner is in mode:" + cleaning_mode);
    }
    public void set_charging(){
        System.out.println("Vacuum cleaner is set to charging");
    }
}
