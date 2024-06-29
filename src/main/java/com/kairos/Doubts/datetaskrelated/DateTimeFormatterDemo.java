package com.kairos.Doubts.datetaskrelated;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        ZonedDateTime currentDateTimeWithOffsetNZoneId = ZonedDateTime.now();
        System.out.println(currentDateTimeWithOffsetNZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = currentDateTimeWithOffsetNZoneId.format(formatter);
        System.out.println(formattedDate);
    }
}
