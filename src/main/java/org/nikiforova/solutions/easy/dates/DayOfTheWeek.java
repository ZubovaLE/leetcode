package org.nikiforova.solutions.easy.dates;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfTheWeek {
    /**
     * @param day - an integer representing a day
     * @param month - an integer representing a month
     * @param year - an integer representing a year
     * @return the corresponding day of the week for the date
     */
    public static String dayOfTheWeek(int day, int month, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
