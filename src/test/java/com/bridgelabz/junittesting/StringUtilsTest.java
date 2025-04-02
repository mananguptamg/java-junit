package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private static StringUtils stringUtils;

    @BeforeAll
    public static void setup(){
        stringUtils = new StringUtils();
    }

    @Test
    @DisplayName("String Reverse Test")
    public void reverseTest(){
        Assertions.assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("String Palindrome Test")
    public void isPalindromeTest(){
        Assertions.assertEquals(true, stringUtils.isPalindrome("naman"));
    }

    @Test
    @DisplayName("String Uppercase Test")
    public void toUppercaseTest(){
        Assertions.assertEquals("HELLO", stringUtils.toUppercase("hello"));
    }
}

