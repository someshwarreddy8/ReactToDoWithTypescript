package com.kairos.Doubts.datetaskrelated;

import java.time.Duration;
import java.time.Instant;

/*
 - Duration is used, when we want to get the time gap between 2 date times.
 - To get the time gap between 2 date times, that time must contain time in it, Otherwise v'll get exception.
 - To get the time gap between 2 dates, use java.time.Period class.
 */
public class DurationDemo {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(2000);
        Instant end = Instant.now();

        Duration pt = Duration.between(start, end);
        System.out.println(pt.getSeconds());
//        System.out.println(pt.abs());
//        System.out.println(pt.toSeconds());
//
//        Duration durationOfHour = Duration.of(1, ChronoUnit.DAYS);
//        System.out.println(durationOfHour);

    }
}
