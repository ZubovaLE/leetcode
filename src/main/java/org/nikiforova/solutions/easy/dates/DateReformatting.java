package org.nikiforova.solutions.easy.dates;

import java.time.LocalDate;
import java.util.Map;

public class DateReformatting {
    private static final Map<String, Integer> months = Map.ofEntries(
            Map.entry("Jan", 1),
            Map.entry("Feb", 2),
            Map.entry("Mar", 3),
            Map.entry("Apr", 4),
            Map.entry("May", 5),
            Map.entry("Jun", 6),
            Map.entry("Jul", 7),
            Map.entry("Aug", 8),
            Map.entry("Sep", 9),
            Map.entry("Oct", 10),
            Map.entry("Nov", 11),
            Map.entry("Dec", 12)
    );

    /**
     * Converts a date string to the format YYYY-MM-DD
     * @param date - a date string in the form Day Month Year
     * @return the date string to the format YYYY-MM-DD
     */
    public static String reformatDate(String date) {
        String[] dayMonthYear = date.split(" ");
        String month = dayMonthYear[0];
        return LocalDate.of(Integer.parseInt(dayMonthYear[2]), months.get(dayMonthYear[1]),
                Integer.parseInt(month.substring(0, month.length() - 2))).toString();
    }
}
