package com.karthik.ds;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringSplit {
    public static void main(String[] args) {

        String source = "810LN15";
        String[] parts = source.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        System.out.println(Arrays.toString(parts));

        Pattern p1 = Pattern.compile("(?<=\\\\d)(?=\\\\D)|(?<=\\\\D)(?=\\\\d)");
        String s1 = "810LN15";
        String[] split = s1.split(p1.pattern());
        for (String s : split
        ) {
            System.out.println(s);
        }
    }
}
