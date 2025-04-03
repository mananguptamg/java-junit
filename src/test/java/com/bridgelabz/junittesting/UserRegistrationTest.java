package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private static UserRegistration userRegistration;

    @BeforeEach
    public void setup() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void registerUser1() {
        Assertions.assertEquals("User registered successfully.", userRegistration.registerUser("manangupta", "manangupta@gmail.com", "S#123123g"));
        System.out.println("User registered successfully");
    }

    @Test
    public void registerUser2() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> userRegistration.registerUser("manangupta", "mananguptagmail.com", "S#123123g"));
        System.out.println("Illegal Argument Exception caught:- Invalid parameters. ");
    }
}
