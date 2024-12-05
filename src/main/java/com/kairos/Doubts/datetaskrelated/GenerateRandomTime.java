package com.kairos.Doubts.datetaskrelated;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class GenerateRandomTime {
    public static void main(String[] args) {
        LocalTime min = LocalTime.MIN;
        LocalTime max = LocalTime.MAX;

        int from = min.toSecondOfDay();
        int to = max.toSecondOfDay();
        String format = "hh:mm a";
        if (isValidPattern(format)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            int generated = ThreadLocalRandom.current().nextInt(from, to);

            LocalTime localTime = LocalTime.ofSecondOfDay(generated);
            String formattedTime = localTime.format( DateTimeFormatter.ofPattern("0onk"));
            System.out.println(formattedTime);
        } else {
            System.out.println("Invalid date format..");
        }
    }

    // Method to validate the date pattern
    private static boolean isValidPattern(String pattern) {
        // Regex to match valid date patterns (this is a simplified example)
        String datePatternRegex = "^[HhmsSa:\\s]+$";
        return Pattern.matches(datePatternRegex, pattern);
    }
}
