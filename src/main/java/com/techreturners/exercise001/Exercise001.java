package com.techreturners.exercise001;

import java.util.List;
import java.text.DecimalFormat;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        String resultStr = word.substring(0, 1).toUpperCase() + word.substring(1);
        return resultStr;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        String resultStr = firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
        return resultStr;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double result = originalPrice+(originalPrice * vatRate * 0.01);
        DecimalFormat df = new DecimalFormat("#.##");
        return  Double.valueOf(df.format(result));
    }

    public String reverse(String sentence) {
        // Add your code here

        if (sentence == null) {
            return null;
        }

        String result = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            result = result + sentence.charAt(i);
        }

        return result;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        long nofLinuxUsers = users.stream().filter(user -> user.getType().equals("Linux") ).count();

        return (int) nofLinuxUsers;
    }
}
