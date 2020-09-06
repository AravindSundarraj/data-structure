package com.kaka.group.binarysearch;

public class IterativeSearch {

    public static void main(String args[]){
    }

    public static boolean findValue(int a[] ,int value){

        boolean flag = false;
        int low = 0;
        int high = a.length;
     //   [3 , 5 , 8, 10, 12, 15, 18,20,20,50,60]
        while(low <=high){
         int mid =   (high - low) /2;
         mid+=low;//11 - 6 = 5
         if(a[mid] == value) {
             return true;

         }
         else if(value < a[mid]){
             high = mid - 1;
         }
         else if(value > a[mid]){
            low = mid + 1; // 6
         }

        }

        return flag;

    }
}
