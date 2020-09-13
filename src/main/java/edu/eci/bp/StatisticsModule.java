package edu.eci.bp;

public class StatisticsModule {
    public static double mean(double[] data) {
        double sum=0.0;
        for (Double i:data) {
            sum+=i;
        }
        return sum/data.length;
    }

    public static double standardDeviation(double[] data) {
        return 0.0;
    }

    public static double mode(double[] data) {
        return 0.0;
    }
}
