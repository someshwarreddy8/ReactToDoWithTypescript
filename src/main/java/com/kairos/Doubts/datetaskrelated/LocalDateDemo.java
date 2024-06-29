package com.kairos.Doubts.datetaskrelated;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate ISO 8601 format: " + currentDate);

        LocalDate customDate = LocalDate.of(2024, Month.AUGUST, 13);
        System.out.println("customDate: " + customDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime: " + currentTime);

        LocalTime customLocalTime = LocalTime.of(13, 51);
        System.out.println("customLocalTime: " + customLocalTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime: " + currentDateTime);
        System.out.println("----------------------------------------");
        predefinedMethodsOfLocalDate(currentDate);
    }

    public static void predefinedMethodsOfLocalDate(LocalDate currentDate) {

        LocalDate beforeDay = currentDate.minusDays(1);
        System.out.println("beforeDay: "+beforeDay);

        boolean isAfter = currentDate.isAfter(beforeDay);
        if(isAfter) {
            System.out.println("Trueeeeee");
        }

        System.out.println("-------------------------");
        Month monthEnum = currentDate.getMonth();
        int monthValue = currentDate.getMonthValue();
        int dayOfMonth = currentDate.getDayOfMonth();
        System.out.println(monthEnum + " : " + monthValue + " : " + dayOfMonth);

        System.out.println("-------------------------");
        Month[] values = Month.values();
        for (Month value : values) {
            System.out.println(value + " : " + value.name());

        }
//        System.out.println(month);
    }
}

