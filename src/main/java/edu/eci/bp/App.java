package edu.eci.bp;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        double[] data= {1.0,1.1,1.2,1.3,1.4,1.5,1.5,1.5,1.6,1.7,1.8,1.9,2.0};
        System.out.println( "La media de los datos es :"+StatisticsModule.mean(data) );
        System.out.println( "La desviacion estándar de los datos es :"+StatisticsModule.standardDeviation(data) );
        System.out.println( "La moda de los datos es :"+StatisticsModule.mode(data) );
    }
}
