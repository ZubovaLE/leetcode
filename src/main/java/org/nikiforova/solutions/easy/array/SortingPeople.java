package org.nikiforova.solutions.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingPeople {
    /**
     * @param names   - an array of strings
     * @param heights - an array of distinct positive integers
     * @return names sorted in descending order by the people's heights
     */
    public String[] sortPeople(String[] names, int[] heights) {
        int arraysSize = names.length;
        Map<Integer, String> heightsAndNames = new HashMap<>();
        String[] peopleAfterSorting = new String[arraysSize];
        for (int i = 0; i < arraysSize; i++) {
            heightsAndNames.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < arraysSize; i++) {
            peopleAfterSorting[arraysSize - i - 1] = heightsAndNames.get(heights[i]);
        }
        return peopleAfterSorting;
    }
}