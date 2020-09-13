package edu.eci.bp;

import java.util.HashMap;
import java.util.Map;

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
        Map<Double,Integer> repeticiones=new HashMap<>();
        double moda=0;
        for (int i=0;i<data.length;i++) {
            if (!repeticiones.containsKey(data[i])){
                repeticiones.put(data[i],1);
            }
            else{
                repeticiones.put(data[i],repeticiones.get(data[i])+1);
            }
            if( i==0 ||repeticiones.get(data[i])>repeticiones.get(moda)){
                moda=data[i];
            }
        }
        return moda;
    }
}
