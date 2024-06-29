package com.kairos.Doubts.datetaskrelated;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        String text = "Hey there. [[MOHAN_REDDY(1)]].[[reddy]],[[somesh]]"; //Random_Number(10)
        Pattern pattern = Pattern.compile("\\[\\[(.*?)]]");
        Matcher matcher = pattern.matcher(text);


        boolean flag = false;
        StringBuilder result = new StringBuilder();;
        while (matcher.find()) {
//            if (matcher.group(1).startsWith(("mOHAN_REDDy").toUpperCase())) {
//                int indexOfParenthesis = matcher.group(1).indexOf('(');
//                String mainName = matcher.group(1).substring(0, indexOfParenthesis).trim(); // "MOHAN_REDDY"
//                String number = matcher.group(1).substring(indexOfParenthesis + 1, matcher.group(1).length() - 1).trim(); // "1"
//
//                System.out.println(mainName + " : " + number);
//            }
            flag = true;


//            System.out.println(matcher.group(1));  // Output: mohan and reddy
            matcher.appendReplacement(result, "SomewhereElse");

            //Random_Number(10).(5)
            //[[]].[[RANDOM_NUMBER(2)]]
            //RANDOM_NUMBER(2)
            // -24
        }
        matcher.appendTail(result);
        System.out.println(result.toString());
        if (!flag) {
            System.out.println("kl");
        }
    }
}
