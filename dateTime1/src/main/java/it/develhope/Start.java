package it.develhope;

import java.time.LocalDate;
import java.time.Year;

public class Start {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        int daysTillEndMonth = today.lengthOfMonth() - today.getDayOfMonth();
        System.out.println("How many days are left till the end of the month? " + daysTillEndMonth);

        Year thisYear = Year.now();
        int daysTillEndYear = thisYear.length() - today.getDayOfYear();
        System.out.println("How many days are left till the end of the year? " + daysTillEndYear);

    }

}
/*
using LocaleDate, calculate and print:
how many days are left till the end of the month
how many days are left till the end of the year,
using the length() method from java.time.Year.of()
 */