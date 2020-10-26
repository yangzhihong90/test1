package com.yzh.demo;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static List<String> list = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits) || digits == null) {
            return list;
        }
        int[] index = new int[]{0};
        backTracking("", digits, index);
        return list;
    }

    public  void backTracking(String combination, String digits, int[] index) {
        if (index[0] == digits.length()) {
            list.add(combination);
        } else {
            int k = Integer.valueOf(digits.substring(index[0], index[0] + 1));
            String letters = KEYS[k];
            index[0]++;
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                backTracking(combination + letter, digits, index);
            }
            index[0]--;
        }
    }
    
}

