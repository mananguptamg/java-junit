package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    private static DateFormatter dateFormatter;

    @BeforeEach
    public void setup(){
        dateFormatter = new DateFormatter();
    }

    @Test
    public void convertDateTest(){
        Assertions.assertEquals("03-04-2025", dateFormatter.convertDate("2025-04-03"));
    }
}
