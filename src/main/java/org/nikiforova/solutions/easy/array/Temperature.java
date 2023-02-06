package org.nikiforova.solutions.easy.array;

public class Temperature {
    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}