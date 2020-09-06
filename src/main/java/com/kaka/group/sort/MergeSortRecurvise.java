package com.kaka.group.sort;

public class MergeSortRecurvise {

    public static void main(String args[]){

        iterateMerge(new int[]{7,8,2,1} , 0 , 3);

    }

    public static void iterateMerge(int a[] ,int lb , int ub){

        if(lb < ub){

            int mid = (lb + ub) /2;

            iterateMerge(a , lb , mid);
            iterateMerge(a , mid + 1 , ub);
        }

    }
}
