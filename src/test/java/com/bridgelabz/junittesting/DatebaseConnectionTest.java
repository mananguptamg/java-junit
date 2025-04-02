package com.bridgelabz.junittesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatebaseConnectionTest {
    @BeforeEach
    public void connect(){
        System.out.println("Database connected successfully");
    }

    @Test
    public void testCase1(){
        System.out.println("Test case 1 executed");
    }

    @Test
    public void testCase2(){
        System.out.println("Test case 2 executed");
    }

    @AfterEach
    public void disconnect(){
        System.out.println("Database disconnected");
    }
}
