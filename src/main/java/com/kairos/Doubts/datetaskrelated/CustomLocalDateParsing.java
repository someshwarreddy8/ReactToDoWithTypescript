package com.kairos.Doubts.datetaskrelated;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CustomLocalDateParsing {
    public static void main(String[] args) {
        DateTimeFormatter LocalDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("mm:HH a");

        LocalDate currentDate = null;
        try {
            // LocalDateFormatter format pattern must be same as Date passed as input.
            // format & date both should be sent by user, when parsing Custom Date to LocalDate.
//            currentDate = LocalDate.parse("2024-03-19", ISO_OFFSET_TIME);

//            String formattedDate = currentDate.atStartOfDay().format(dateTimeFormatter);
//            System.out.println(formattedDate);

            String format = LocalDate.now().format(LocalDateFormatter);
//            System.out.println(format);

            String timeFormat = LocalTime.now().format(timeFormatter);
            System.out.println(timeFormat);
        } catch (DateTimeParseException ex) {
            System.out.println("Local date parse issue.");
        } catch (IllegalArgumentException ia){
            System.out.println("illegal argument exception...");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
