package com.kairos.Doubts.datetaskrelated;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
    public static void main(String[] args) {

        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
        LocalDate.now();
        LocalDateTime.now();
        System.out.println( LocalDateTime.now().format(formatter) );

        String formatted = LocalTime.now().format(formatter);
        System.out.println(formatted);
    }
}
