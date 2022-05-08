package com.karthik.ds;
import java.util.HashMap;
import java.util.Map;

public class VowelCount {
    public static void main(String[] args) {
        String s1 = "KaRtHik Akinapelli";
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    if (hashMap.containsKey(c))
                        hashMap.put(c, hashMap.get(c) + 1);
                    else
                        hashMap.put(c, 1);
                    break;
                default:

            }
        }

        System.out.println(hashMap);
    }
}
