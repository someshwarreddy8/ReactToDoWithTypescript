package com.kairos.Doubts.PatternRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateTimeWithSpecificPattern {
    public static void main(String[] args) {
        final Pattern VALID_DATE_PATTERN = Pattern.compile("^(MM|MMM|MMMM|dd|yyyy)([-/.])(MM|MMM|MMMM|dd|yyyy)([-/.])(MM|MMM|MMMM|dd|yyyy)$");
        final Pattern VALID_TIME_PATTERN = Pattern.compile("^(HH|hh):mm?( a)?$");

        Matcher timeMatcher = VALID_TIME_PATTERN.matcher("hh:mm a");
        System.out.println(timeMatcher.matches());
        Matcher matcher = VALID_DATE_PATTERN.matcher("dd:yyyy:Mm");
//        System.out.println(matcher.matches());

    }
}
