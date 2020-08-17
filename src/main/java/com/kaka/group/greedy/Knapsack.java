package com.kaka.group.greedy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Knapsack {

    public static Map<Integer, Sack> sackMap = new HashMap<>();
    private static DecimalFormat df2 = new DecimalFormat("#.####");
    static Keys[] v = null;
    // public static double v [] = null;

    public static void main(String args[]) {

       /* 1 1000
        500 30*/
       /* int[] values = {60, 100, 120};
        int[] weights = {20, 50, 30};*/

        int[] values = {500};
        int[] weights = {30}; //16.666  - > 1 kg
        v = new Keys[values.length];
        double d = getOptimalValue(10, values, weights);
        System.out.println("Profit ==>>" + d);

     /*   int[] valuess = {500}; int[] weightss = {30};
        double dd = getOptimalValue(10 , valuess , weightss);
        System.out.println("Profitsssssssssss ==>>" +dd);
        //setData(values , weights);*/

        System.out.format("%.3f", d);
    }


    private static double getOptimalValue(int capacity, int[] values, int[] weights) {

        if (capacity <= 0) return 0.0000;
        v = new Keys[values.length];
        double value = 0;
        double profit = 0.0;
        double tempCap = capacity;
        //write your code here
        // get the value for one kg
        int totalItems = values.length;
        setData(values, weights);
        double cap = capacity;

        while (tempCap > 0 && totalItems > 0) {
            for (int i = 0; i < v.length; i++) {
                totalItems--;
                Sack sack = sackMap.get(v[i].getObj());

                if (tempCap <= 0) tempCap = 0;
                if (sack.weight < tempCap || sack.weight == tempCap) {
                    double t = tempCap - sack.weight;
                    profit = profit + sack.totVal;
                    tempCap = t;
                    continue;
                } else if (tempCap > 0 && tempCap < sack.weight) {
                    double tempPro = tempCap * sack.ratio;
                    profit = profit + tempPro;
                    tempCap = tempCap - sack.weight;
                   // System.out.println("The Pro =" + profit);
                    continue;
                }

            }


        }

        Double truncatedDouble = BigDecimal.valueOf(profit)
                .setScale(4, RoundingMode.HALF_UP)
                .doubleValue();

        return truncatedDouble;
    }

    public static void setData(int[] values, int[] weights) {
        double temp = 0;
        int mapKey = 1;
        int key = 0;
        for (int i = 0; i < values.length; i++) {
            BigDecimal d = BigDecimal.valueOf(values[i]).divide(BigDecimal.valueOf(weights[i])
                    , 10, RoundingMode.HALF_UP);
            //double d = values[i] / weights[i];
            System.out.println("Divide ==>>" + d);


            /*Double truncatedDouble = d
                    .setScale(4, RoundingMode.HALF_UP)
                    .doubleValue();*/
            sackMap.put(mapKey, new Sack(values[i], weights[i], d.doubleValue()));
            v[i] = new Keys(mapKey, d.doubleValue());
            mapKey++;

        }

        Arrays.sort(v, Comparator.comparing(Keys::getRatio).reversed());

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }

    static class Keys {
        int obj;

        double ratio;

        public Keys(int obj, double ratio) {
            this.obj = obj;
            this.ratio = ratio;
        }

        public int getObj() {
            return this.obj;
        }

        public double getRatio() {
            return this.ratio;
        }

        public String toString() {
            return "Object: " + this.obj + " Ratio: " + this.ratio;
        }
    }

    static class Sack {
        //double val;
        double weight;
        double totVal;
        //int obj;
        double ratio;

        public Sack(double totVal, double weight, double ratio) {
            this.totVal = totVal;
            this.weight = weight;
            this.ratio = ratio;
        }

        public double getWeight() {
            return this.weight;
        }

        public double getTotVal() {
            return this.totVal;
        }

        public double getRatio() {
            return this.ratio;
        }

    }
}
