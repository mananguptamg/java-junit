package com.bridgelabz.junittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean registerUser(String username, String email, String password){
        if(isValidUsername(username) && isValidEmail(email) &&isValidPassword(password)){
                System.out.println("User registered successfully.");
                return true;
        }
        else{
            throw new IllegalArgumentException("Invalid input.");
        }
    }
    public boolean isValidUsername(String username){
        String regex = "[A-Za-z0-9_-]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if(matcher.find()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9+-_\\.]+@[A-Za-z0-9]+\\.[a-zA-Z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.find()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isValidPassword(String password){
        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if(matcher.find()){
            return true;
        }
        else{
            return false;
        }
    }
}
