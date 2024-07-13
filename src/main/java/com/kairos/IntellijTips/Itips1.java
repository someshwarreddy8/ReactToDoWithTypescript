package com.kairos.IntellijTips;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Itips1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(""));
        ArrayList<String> lines;
        lines = new ArrayList<>();
// TODO: 01-07-2024 // TODO: 01-07-2024
        String line;
        while ((line = reader.readLine()) != null) {
            if (isValid(line)) {
                lines.add(line);
            }
        }
    }

    private static boolean isValid(String line) {
        return !line.isEmpty();
    }
}
