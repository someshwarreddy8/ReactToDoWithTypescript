package com.kairos.Doubts;

import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now().toInstant().toEpochMilli());
    }
}
