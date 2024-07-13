package com.kairos.Doubts.Lombok;

public class LombokMain {
    public static void main(String[] args) {
        var builder = BuilderAnnotation.builder().id(1).name("somesh").build();
        System.out.println(builder);

//        new BuilderAnnotation();
    }
}
