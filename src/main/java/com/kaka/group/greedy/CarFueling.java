package com.kaka.group.greedy;

import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int distance, int carKilo,  int[] fuelStation) {


        int fuelPoint = fuelStation.length;
        int carKilos = carKilo;
        int noOfPts = 0;
        int i = 0;
        while (fuelStation[i] < distance && fuelPoint > 0) {



            while (fuelStation[i + 1] <= carKilos){


                i++;
                fuelPoint--;

            }

            if(fuelStation[i + 1] - fuelStation[i] <= carKilo ) {
                noOfPts++;
                carKilos = fuelStation[i]  + carKilo;

            }
            else {
                return -1;
            }
            if(fuelPoint > 0)

                fuelPoint--;

        }


        return noOfPts;




    }

    public static int[] getAdded(int[] a , int distance){
        System.out.println("The input is empty==>>"+ a);
        System.out.println("The input test ==>>"+ a.length);
        System.out.println("Distance :" +distance);
        for(int i =0 ; i < a.length; i++){
            System.out.println("Print input =>" +a[i]);
        }
        int[] aa = new int[a.length + 2];
        aa[0] = 0;
        aa[aa.length - 1] = distance;
        for(int i = 0; i < a.length; i++){
            aa[i+1] = a[i];
        }
        return aa;
    }

    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        int dist = 100;
        int tank = 25;
      //  int n = scanner.nextInt();
        int stops[] = new int[]{25 , 50 ,75 };
       /* for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }*/

        int [] k = getAdded(stops , dist);
        int y =	computeMinRefills(dist, tank, k);
        System.out.println(y);
    }
}

