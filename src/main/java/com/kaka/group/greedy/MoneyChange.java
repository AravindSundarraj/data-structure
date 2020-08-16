package com.kaka.group.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MoneyChange {

    public static Map<Integer , Integer> changeMap = new HashMap<>();

    public static void main(String arg[]){

        changeMap.put( 1  ,1);
        changeMap.put(5 , 5);
        changeMap.put(10 , 10);
        int c = getChange(2);
        System.out.println("The Change : "+c);
       int cc = getChange(28);
        System.out.println("The Change : "+cc);
        int ccc = getChange(0);
        System.out.println("The Change : "+ccc);
        int cccc = getChange(10);
        System.out.println("The Change : "+cccc);
    }

    public static int getChange(int bal){

        int temp = bal;
        int count = 0;
        if(bal == 0) return 0;

        if(changeMap.get(bal) != null) return 1;

        while(temp > 0){

            if((temp /10)  >= 1){
                temp = temp - 10;
                count++;
                continue;
            }
            else if((temp /5) >= 1){
                temp = temp - 5;
                count++;
                continue;
            }
            else if((temp/1) >=  1){
                temp = temp - 1;
                count++;
            }

        }

        return count;
    }
}
