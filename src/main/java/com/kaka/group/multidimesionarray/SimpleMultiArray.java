package com.kaka.group.multidimesionarray;

public class SimpleMultiArray {

    public static void main(String args[]){
        // r*c
        int i [][] = new int[2][3];

       // 2 * 3 = 6
        i[0][0] = 10;
        i[0][1]  = 40;
       i [0][2]  = 100;
        i[1][0]  = 200;
        i[1][1]  = 300;
        i[1][2]  = 400;


        for(int j = 0; j < i.length ; j++){
            for(int u = 0; u < i[j].length; u++){
                System.out.println(i[j][u]);
            }
        }

    }
}
