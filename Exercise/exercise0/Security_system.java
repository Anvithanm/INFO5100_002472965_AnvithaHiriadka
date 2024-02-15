package com.Exercise.exercise0;
public class Security_system {
    String user_id;
    String user_password;
    String device_name;
    byte no_of_cameras;
    String power_supply;
    String security_type;
    String camera_status;
    String alarm_sensor_state;
    String armed_enabled;
    public Security_system(String power, String type, String cam_state, byte camera_count, String armed_state){
        user_id = "Anvitha";
        user_password = "ah1234";
        power_supply = power;
        security_type = type;
        camera_status = cam_state;
        no_of_cameras = camera_count;
        armed_enabled = armed_state;
        System.out.println(security_type+ " security cameras are "+ cam_state+"d" );
    }
    public Security_system(String device, String power, String type, String sensor){
        device_name = device;
        power_supply = power;
        security_type = type;
        alarm_sensor_state = sensor;
        System.out.println("Security system "+device_name+" is "+power_supply);
    }
    public void connect_system_app(){
        System.out.println("Security system is successfully connected to Mobile app");
    }
    public void camera_settings(){
        System.out.println(no_of_cameras+" Cameras are turned "+ camera_status);
    }
    public void setArmed_enabled(){
        System.out.println("Property is:"+armed_enabled);
    }
}