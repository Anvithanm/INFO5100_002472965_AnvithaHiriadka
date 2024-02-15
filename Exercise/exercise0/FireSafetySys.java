package com.Exercise.exercise0;
public class FireSafetySys{
    String location;
    byte extinguisher_count;
    String Power_state;
    String Power_source;
    int model_number;
    float sensitivity_level;
    String last_maintenance_date;
    String status;
    String device_name;
    public FireSafetySys(String loc, String state, String source, String device){
        location = loc;
        extinguisher_count = 3;
        Power_state = state;
        Power_source = source;
        model_number = 12345;
        sensitivity_level = 0.6F;
        last_maintenance_date = "May,21,2023";
        status = "operational";
        device_name = device;
        System.out.println(device_name+" is: "+Power_state+" in "+location);
    }
    public void activate_system(){
        System.out.println("The fire and safety system is active");
    }
    public void deactivate_system(){
        System.out.println("The fire and safety system is deactivated");
    }
    public void perform_maintenance(){
        System.out.println("Fire and safety system maintenance check is complete");
    }
}
