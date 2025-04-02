package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    private static TemperatureConverter temperatureConverter;

    @BeforeEach
    public void setup(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void celsiusToFahrenheitTest(){
        Assertions.assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(0.0));
    }

    @Test
    public void fahrenheitToCelsiusTest(){
        Assertions.assertEquals(0.0, temperatureConverter.fahrenheitToCelsius(32.0));
    }
}
