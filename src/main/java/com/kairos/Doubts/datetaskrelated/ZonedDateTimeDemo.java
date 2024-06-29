package com.kairos.Doubts.datetaskrelated;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        //By default returns system default timezone date time
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        ZonedDateTime previousDay = currentZonedDateTime.minusDays(2);
//        System.out.println(previousDay);
        ZonedDateTime previousHour = currentZonedDateTime.minusHours(1);
//        System.out.println(previousHour);

//        LocalDateTime localDateTime = null;
        String formattedDateTime;
        LocalDate currentDate = null;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        formattedDateTime = (currentDate != null && currentDate instanceof LocalDate) ? currentDate.atStartOfDay().format(dateTimeFormatter) : currentZonedDateTime.format(dateTimeFormatter);

//        if (currentDate != null && currentDate instanceof LocalDate) {
//            formattedDateTime = currentDate.atStartOfDay().format(dateTimeFormatter);
//        } else {
//            formattedDateTime = currentZonedDateTime.format(dateTimeFormatter);
//        }

        System.out.println(formattedDateTime);
    }
}
