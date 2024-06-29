package com.kairos.Doubts.datetaskrelated;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatLocalDate {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // If we want to parse a string, which is in a custom date format to LocalDate format(i.e.,yyyy-MM-dd),
        // we have to specify parse() of LocalDate, in which format that date string is coming using DateTimeFormatter.ofPattern().
        // Otherwise, v'll get exception.
        LocalDate parsedDate = LocalDate.parse("13-09-2024", formatter);
        System.out.println("Parsed LocalDate: " + parsedDate);
    }
}
