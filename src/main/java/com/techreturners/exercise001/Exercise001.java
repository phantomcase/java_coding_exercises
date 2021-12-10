package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String resultStr = word.substring(0, 1).toUpperCase() + word.substring(1);
        return resultStr;
    }

    public String generateInitials(String firstName, String lastName) {
        String resultStr = firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
        return resultStr;
    }

    public double addVat(double originalPrice, double vatRate) {
        double result = originalPrice+(originalPrice * vatRate * 0.01);
        DecimalFormat df = new DecimalFormat("#.##");
        return  Double.valueOf(df.format(result));
    }

    public String reverse(String sentence) {

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
