package org.nikiforova.solutions.easy.dates;

import java.time.LocalDate;

public class DayOfTheYear {
    /**
     * @param date - a string date representing a Gregorian calendar date formatted as YYYY-MM-DD
     * @return the day number of the year
     */
    public static int dayOfYear(String date) {
        String[] yearMonthDay = date.split("-");
        return LocalDate.of(Integer.parseInt(yearMonthDay[0]), Integer.parseInt(yearMonthDay[1]),
                Integer.parseInt(yearMonthDay[2])).getDayOfYear();
    }
}
