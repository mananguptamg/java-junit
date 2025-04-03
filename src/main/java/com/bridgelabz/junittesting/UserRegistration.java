package com.bridgelabz.junittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public String registerUser(String username, String email, String password){
        try {
            if(isValidUsername(username) && isValidEmail(email) &&isValidPassword(password)){
                return "User registered successfully.";
            }
            else{
                throw new IllegalArgumentException("Invalid parameters");
            }
        }catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error " + e.getMessage());
        }
    }

    public boolean isValidUsername(String username){
        String regex = "[A-Za-z0-9_-]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        return matcher.find();
    }

    public boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9+-_\\.]+@[A-Za-z0-9]+\\.[a-zA-Z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }

    public boolean isValidPassword(String password){
        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }
}
