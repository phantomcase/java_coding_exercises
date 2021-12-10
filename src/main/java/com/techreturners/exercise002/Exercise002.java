package com.techreturners.exercise002;

import java.util.List;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        final boolean resultIsFromManchester = person.getCity().equals("Manchester");
        return resultIsFromManchester;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        final boolean resultCanWatchFilm = person.getAge() >= ageLimit;
        return resultCanWatchFilm;
    }
    
}
