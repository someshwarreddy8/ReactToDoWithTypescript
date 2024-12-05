package com.kairos.Doubts.PatternRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\[(.*?)]");
        Matcher matcher = pattern.matcher("abc[xyz]");

        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
        }
    }
}
