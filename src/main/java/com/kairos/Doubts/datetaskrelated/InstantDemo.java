package com.kairos.Doubts.datetaskrelated;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class InstantDemo {
    public static void main(String[] args) {
        Instant currentInstant = Instant.now(Clock.system(ZoneId.of("Asia/Calcutta")));
//        System.out.println("currentInstant: "+currentInstant);

//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        Instant instantTime = Instant.now();
        System.out.println(instantTime);
        System.out.println(instantTime.toEpochMilli());
        System.out.println(instantTime.getEpochSecond());
        System.out.println(instantTime.atOffset(ZoneOffset.of("+5:30")));
    }
}
