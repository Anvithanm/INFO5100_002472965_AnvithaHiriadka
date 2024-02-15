package com.Exercise.exercise0;
public class IOTSystems{
    String device_name;
    String location_name;
    byte number_of_lights;
    String light_color;
    byte temperature;
    char temperature_unit;
    public IOTSystems(String device, String location, byte lights_count, String color){
        device_name = device;
        location_name = location;
        light_color = color;
        number_of_lights = lights_count;
        System.out.println("The Smart Light system is Active");
    }
    //Using constructor overloading for temperature sensor object
    public IOTSystems(String device, String location, char unit){
        device_name = device;
        location_name = location;
        temperature_unit  = unit;
        temperature = 25;
        System.out.println(device_name+" system in the "+location_name+" has default temperature as:"+temperature+"\u00B0"+temperature_unit);
    }
    public void device_on_off(String status_value){
        System.out.println("\nThe device " +device_name+ " in the "+location_name+" is turned "+status_value);
    }
    public void change_light_color(){
        System.out.println("The light colors are changed to: " +light_color);
    }
    //This is a nested class 1-Non static type
    class Thermostat_System{
        public void get_temperature(){
            System.out.println("The current temperature is: "+temperature+"\u00B0"+temperature_unit);
        }
    }
    //This is Nested Class 2
    public static class Network_system{
        String router_id;
        String router_password;
        public Network_system(){
            router_id = "Anvitha";
            router_password = "NEU2024";
            System.out.println("The Network Connection is Activated");
        }
        public void connect_router(){
            //My body would include body to connect to a router using user credentials for in terms of real time device
            System.out.println("The router is connected");
        }
    }
}