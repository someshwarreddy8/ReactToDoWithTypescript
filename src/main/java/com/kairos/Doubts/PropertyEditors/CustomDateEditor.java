package com.kairos.Doubts.PropertyEditors;

import java.time.format.DateTimeFormatter;

public class CustomDateEditor {
    public static void main(String[] args) {
        String date = "26-08-1998";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        new CustomDateEditor(formatter, true);
        //trigger check
        //tc4
    }
}
