package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime inputTime;
    private LocalDateTime resultTime;

    public Exercise004(LocalDate date) {
        inputTime = date.atStartOfDay();
        resultTime = AddTime(inputTime);
    }

    public Exercise004(LocalDateTime dateTime) {
        inputTime = dateTime;
        resultTime = AddTime(inputTime);
    }

    private LocalDateTime AddTime(LocalDateTime dateTime){
        LocalDateTime timeAdded = dateTime.plusSeconds(1000000000);
        return timeAdded;
    }

    public LocalDateTime getDateTime() {
        return resultTime;
    }
}
