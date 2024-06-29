package com.kairos.Doubts.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 7};
        Integer[] arr1 = {1, 2, 8, 9, 10, 11, 12, 12, 13, 12};

        Set<Integer> s = new HashSet<>(Arrays.asList(arr));
        Set<Integer> s1 = new HashSet<>(Arrays.asList(arr1));
//        s.addAll(s1);
//        s.retainAll(s1);
        s.removeAll(s1);

        System.out.println(s);

    }
}
