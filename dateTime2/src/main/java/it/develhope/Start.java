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
/*
calculate and print:
using LocaleDateTime, the current date and time in the following format:
DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
using ZonedDateTime, the current date and time in ISO Zoned Date Time format
 */