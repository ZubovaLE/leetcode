package org.nikiforova.solutions.easy.dates;

import java.time.Duration;
import java.time.LocalDate;

public class NumberOfDaysBetweenTwoDates {
    /**
     * Counts the number of days between two dates
     *
     * @param date1 - first date as a string
     * @param date2 - second date as a string
     * @return the number of days between date1 and date2
     */
    public static int daysBetweenDates(String date1, String date2) {
        String[] yearMonthDayOne = date1.split("-");
        String[] yearMonthDayTwo = date2.split("-");
        LocalDate one = LocalDate.of(Integer.parseInt(yearMonthDayOne[0]), Integer.parseInt(yearMonthDayOne[1]),
                Integer.parseInt(yearMonthDayOne[2]));
        LocalDate two = LocalDate.of(Integer.parseInt(yearMonthDayTwo[0]), Integer.parseInt(yearMonthDayTwo[1]),
                Integer.parseInt(yearMonthDayTwo[2]));
        long days = Duration.between(one.atStartOfDay(), two.atStartOfDay()).toDays();
        return (int) Math.abs(days);
    }
}
