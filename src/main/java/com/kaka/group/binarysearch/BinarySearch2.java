package com.kaka.group.binarysearch;

public class BinarySearch2 {

    public static void main(String args[]){

        int a[] = {5, 9, 17, 23, 25, 45, 59,63, 71, 89};
       indexBinary(a , 0 , a.length -1, 9);
       //System.out.println("Position ===>>" +position);
    }

    public static void  indexBinary(int a[] , int start , int end , int value){

        if(start > end){
            System.out.println("-1");
            return ;
        }

        int mid = (start + end) / 2;

        if(a[mid] == value){
            System.out.println("The Index " +mid);
            return ;
        }
        if(a[mid] < value){
            indexBinary(a , mid + 1 , end, value);
        }
        if(a[mid] > value){
            indexBinary(a , start ,mid - 1 , value );
        }



    }
}
