package com.kairos.Doubts.datetaskrelated;

import java.time.LocalDate;
import java.time.Period;

/*
 - Duration is used, when we want to get the time gap between 2 date times.
 - To get the time gap between 2 date times, that time must contain time in it, Otherwise v'll get exception.
 - To get the time gap between 2 dates, use java.time.Period class.
 */
public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDate beforeDay = currentDate.minusDays(5);

        Period duration = Period.between(beforeDay, currentDate);

        System.out.println(duration.getDays());
    }
}
