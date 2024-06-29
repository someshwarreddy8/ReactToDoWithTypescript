package com.kairos.Doubts.datetaskrelated;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class GenerateRandomDate {
    public static void main(String[] args) {
        LocalDate from = LocalDate.of(1970, 1, 1);
        LocalDate to = LocalDate.now();

        long fromEpochDay = from.toEpochDay();
        long toEpochDay = to.toEpochDay();

        long randomDay = ThreadLocalRandom.current().nextLong(fromEpochDay, toEpochDay);

        String format = "dd-Mb-yyyy";
        String formattedDate = null;
        DateTimeFormatter formatter = null;
        if (isValidPattern(format)) {
            try {
                formatter = DateTimeFormatter.ofPattern(format);
                LocalDate localDate = LocalDate.ofEpochDay(randomDay);
                formattedDate = localDate.format(formatter);
            } catch (UnsupportedTemporalTypeException ue) {
                System.out.println(ue);
            } catch (IllegalArgumentException ie){
                System.out.println("It's illegal arg exception.");
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(formattedDate);
        } else {
            System.out.println("Invalid pattern.");
        }
    }

    private static boolean isValidPattern(String pattern) {
        // Regex to match valid date patterns (this is a simplified example)
        String datePatternRegex = "^[dMy\\-./\\s]+$";
        return Pattern.matches(datePatternRegex, pattern);
    }
}
