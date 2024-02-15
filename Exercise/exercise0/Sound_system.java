package com.Exercise.exercise0;

public class Sound_system {
    String system_on_off;
    String device_name;
    String input_source;
    String music_mode;
    byte volume;
    String mute_state;
    byte bass_value;
    byte treble_value;
    public Sound_system(String power, String device, String source, String mode,
                        byte vol, String state, byte bass, byte treble){
        system_on_off = power;
        device_name = device;
        input_source = source;
        music_mode = mode;
        volume = vol;
        mute_state = state;
        bass_value = bass;
        treble_value = treble;
        System.out.println(device_name+" is "+system_on_off+" with equalizer settings as (bass="+bass_value+" treble="+treble_value+")");
    }
    public void sound_system_power(){
        System.out.println("The sound system is Powered:" + system_on_off);
    }
    public void change_volume(){
        System.out.println("The volume of the speaker is set to: "+volume);
    }
    public void custom_equalizer(){
        System.out.println("The custom equalizer settings are applied to the system");
    }
}

