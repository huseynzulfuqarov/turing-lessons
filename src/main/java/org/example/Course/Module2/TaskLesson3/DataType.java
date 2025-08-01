package org.example.Course.Module2.TaskLesson3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DataType {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate myBirthday = LocalDate.of(2005, 5, 6);

        long days = today.toEpochDay() - myBirthday.toEpochDay();

        System.out.println("Birthday with days: " + days);

        LocalTime min = LocalTime.MIN;

        LocalTime max = LocalTime.MAX;

        System.out.println("Minimum time: " + min);
        System.out.println("Maximum time: " + max);

        ZoneId turkeyZone = ZoneId.of("Europe/Istanbul");
        ZonedDateTime turkiye = ZonedDateTime.now(turkeyZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted = turkiye.format(formatter);
        System.out.println("Türkiyə vaxtı: " + formatted);
        System.out.println(turkiye);
    }
}

