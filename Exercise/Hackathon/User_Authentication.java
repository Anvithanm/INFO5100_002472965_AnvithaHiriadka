package com.Exercise.Hackathon;
/*
This class implements User Authentication System for Library Management System
This class has username and password stored in a hashmap

Usage : Please use the Username as : user1 and Password = password123 or
        Username as : user2 and Password = password123
 */

import java.util.HashMap;

public class User_Authentication {
    private HashMap<String, String> user_data = new HashMap<>();
    public User_Authentication(){
        user_data.put("user1", "password123");
        user_data.put("user2", "password123");
    }
    public boolean authenticateUser(String username, String password) {
        // Check if the username exists in the database and if the password matches
        return user_data.containsKey(username) && user_data.get(username).equals(password);
    }
}
