package com.kaka.group.greedy;

import java.util.Arrays;
import java.util.List;

public class FuelRefilling {


    /*Input:
            500
            200
            4
            100 200 300 400*/
    public static void main(String args[]) {





    }

    public static int[] getAdded(int[] a , int distance){
        int[] aa = new int[a.length + 2];
        aa[0] = 0;
        aa[aa.length - 1] = distance;
        for(int i = 0; i < a.length; i++){
            aa[i+1] = a[i];
        }
        return aa;
    }

    /*
    we all need to be considered 1. total fuel tank capacity.
    fuel points
    difference between one fuel pt to another fuel point
    left out fuel
     */
    // 200 375 550 750
    public static int reFilling(int distance, int carKilo, int[] fuelStations) {

        int[] fuelStation = getAdded(fuelStations , distance);

        int fuelPoint = fuelStation.length;
        int carKilos = carKilo;
        int noOfPts = 0;
        int i = 0;
        if(carKilo >= distance) return 0;
        //else if(fuelPoint <= 2 && carKilo < distance ) return -1;
        while (fuelStation[i] < distance && fuelPoint > 0) {


            while (fuelStation[i + 1] <= carKilos){


                    i++;
                    fuelPoint--;
                    if(i == fuelStation.length - 1) break;

            }

            if(i < fuelStation.length - 1)
            if(fuelStation[i + 1] - fuelStation[i] <= carKilo ) {
                noOfPts++;
                carKilos = fuelStation[i]  + carKilo;

            }
            else {
                return -1;
            }

           /* if(fuelPoint > 0)
            fuelPoint--;*/

        }

        return noOfPts;

    }
}

