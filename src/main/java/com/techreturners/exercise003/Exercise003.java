package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {
    final String[] flavoursMap = new String[] { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

    int getIceCreamCode(String iceCreamFlavour) {
        return Arrays.asList(flavoursMap).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return flavoursMap;
    }

}
