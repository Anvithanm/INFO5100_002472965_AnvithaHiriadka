package com.Exercise.exercise0;
/*
========================================================================================================================
Author = Anvitha Hiriadka
Submitted on 14/02/2024
========================================================================================================================
Exercise0 package consists of 10 classes(separate class files), 8 Properties(for each class), 3 methods and 3 objects.
10 classes include
- Car_driving_system
- FireSafetySys
- IOTSystems
    - Thermostat_System
    - Network_system
- Laundry_system
- Robo_vacuum_system
- Security_system
- Sound_system
- SprinklerSystems
========================================================================================================================
*/
public class Main {
    public static void main(String[] args) {
        SprinklerSystems control_panel = new SprinklerSystems("on","Control system", "Active", "6:00AM");
        SprinklerSystems water_supply = new SprinklerSystems("on","Water supply system","Active", "6:00AM");
        SprinklerSystems sprinkler_head = new SprinklerSystems((short)90,(short)10);
        FireSafetySys fire_extinguisher = new FireSafetySys("living_room","ON","hard wired","Fire extinguisher");
        FireSafetySys smoke_detector = new FireSafetySys("living room", "OFF", "battery", "Smoke detector");
        FireSafetySys fire_alarm = new FireSafetySys("lobby","ON","battery","Alarm");
        IOTSystems smart_lights = new IOTSystems("smart lights", "bedroom", (byte)4, "amber");
        IOTSystems temperature_sensor = new IOTSystems("Thermostat", "living room", 'c');
        IOTSystems.Thermostat_System room_temperature = temperature_sensor.new Thermostat_System();
        IOTSystems.Network_system network = new IOTSystems.Network_system();
        Sound_system sound_bar = new Sound_system("ON","Sound bar", "Bluetooth", "Rock",(byte)20, "unmute", (byte)2,(byte)3);
        Sound_system sub_woofer = new Sound_system("ON", "Sub woofer","Bluetooth", "pop",(byte)20, "unmute", (byte)8,(byte)4);
        Sound_system rear_speakers = new Sound_system("ON", "Rear speakers","Bluetooth", "pop",(byte)20, "mute", (byte)5,(byte)3);
        Laundry_system washing_machine = new Laundry_system("ON", "Washing", "normal", "heavy", "auto-sensing");
        Laundry_system dryer_machine = new Laundry_system ("ON", "Drying", (byte)60, "yes");
        Laundry_system Water_supply = new Laundry_system("ON","hot");
        Robo_vacuum_system vacuum = new Robo_vacuum_system("ON", "vacuum", "living room", (short)3000);
        Robo_vacuum_system mopping_mode = new Robo_vacuum_system("ON","vacuum and mopping", "kitchen", (short)3000);
        Robo_vacuum_system charging_mode = new Robo_vacuum_system("ON");
        Security_system security_camera = new Security_system("ON", "Indoor", "enable", (byte)4, "Active");
        Security_system security_alarm = new Security_system("Alarm","ON","Outdoor","Active");
        Security_system motion_sensor = new Security_system("Motion sensor","ON","Outdoor","Active");
        Car_driving_system normal_mode = new Car_driving_system("ON", "normal","drive",(byte)5,(byte)7,"independent");
        Car_driving_system sports_mode = new Car_driving_system("ON", "sports","drive",(byte)9,(byte)15,"performance_independent");
        Car_driving_system chill_mode = new Car_driving_system("ON", "chill","drive",(byte)3,(byte)6,"Active");
    }
}