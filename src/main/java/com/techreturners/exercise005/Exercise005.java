package com.techreturners.exercise005;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise005 {

    public boolean isPangram(String input) {
        String trimInput = input.toLowerCase().replaceAll("(.)(?=.*\\1)","");
        trimInput = trimInput.replaceAll("[^a-z]+","");
        Integer nofChar = trimInput.length();
        return nofChar == 26;
    }

}
