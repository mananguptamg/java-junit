package com.bridgelabz.junittesting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String convertDate(String inputDate){
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, inputFormat);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(outputFormat);
    }
}
