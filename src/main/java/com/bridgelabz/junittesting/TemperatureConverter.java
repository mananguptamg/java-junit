package com.bridgelabz.junittesting;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius){
        double result = ((celsius*9)/5)+32;
        System.out.println(celsius+" celsius in fahrenheit is "+result);
        return result;
    }
    public double fahrenheitToCelsius(double fahrenheit){
        double result = ((fahrenheit-32)*5)/9;
        System.out.println(+fahrenheit+" fahrenheit in celsius is "+result);
        return result;
    }
}
