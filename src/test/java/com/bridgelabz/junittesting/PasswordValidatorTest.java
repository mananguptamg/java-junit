package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private static PasswordValidator passwordValidator;

    @BeforeEach
    public void setup(){
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void isValidTest(){
        Assertions.assertEquals(true, passwordValidator.isValid("S#123123g"));
        Assertions.assertEquals(false, passwordValidator.isValid("123qwe"));
        Assertions.assertEquals(false, passwordValidator.isValid("S123123g"));
    }
}
