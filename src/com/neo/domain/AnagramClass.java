package com.neo.domain;

import java.util.HashMap;
import java.util.Map;

public class AnagramClass {
    public static boolean areKAnagrams(String str1, String str2, int k) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int changesRequired = 0;
        for (char ch : str2.toCharArray()) {
            if (freqMap.containsKey(ch) && freqMap.get(ch) > 0) {
                freqMap.put(ch, freqMap.get(ch) - 1);
            } else {
                changesRequired++;
            }
        }
        return changesRequired <= k;
    }

    public static void main(String[] args) {
        String str1 = "fodr";
        String str2 = "gork";
        int k = 1;

        boolean result = areKAnagrams(str1, str2, k);
        System.out.println(result);
    }
}
