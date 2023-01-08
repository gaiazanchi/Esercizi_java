package it.develhope;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd MMMM YY HH mm")));

        ZonedDateTime todayZoned = ZonedDateTime.now();

        System.out.println(todayZoned);

    }

}