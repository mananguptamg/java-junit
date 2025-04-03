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
        Assertions.assertEquals(true, userRegistration.registerUser("manangupta", "manangupta@gmail.com", "S#123123g"));
    }

    @Test
    public void registerUser2() {
        Assertions.assertEquals(false, userRegistration.registerUser("manangupta", "mananguptagmail.com", "S#123123g"));
    }
}
