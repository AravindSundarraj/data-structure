package com.kaka.group.binarysearch;

/*
Given array for integer  ,return index of the integer if present.


 */
public class IterativeIndexPosition {

    public static void main(String args[]){
      int index =  getIndex(new int[]{3 , 5 , 8, 10, 12, 15, 18,20,20,50,60} , 5);
      System.out.println("Index ==>" +index);
    }


    //   [3 , 5 , 8, 10, 12, 15, 18,20,20,50,60]
    public static int getIndex(int a[] ,int value){

        int index = 0;
        int low = 0;
        int high = a.length;
        while(low <high) {
            int mid = (high - low) / 2;
            mid += low;
            if (mid < a.length && a[mid] == value) {

                return mid + 1  ;
            } else if (mid < a.length && value < a[mid]) {
                index  = mid;
                high = mid - 1;
            } else if (mid < a.length && value > a[mid]) {
                index  = mid;
                low = mid + 1; // 6
            }
        }

        return index + 1;

    }
}
