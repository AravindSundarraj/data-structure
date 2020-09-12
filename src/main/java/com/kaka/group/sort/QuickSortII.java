package com.kaka.group.sort;

public class QuickSortII {

    public static void main(String args[]){

        int a[] = {7, 2, 1, 8, 6, 3, 5, 4};
        quickSort(a , 0 , a.length - 1);

        System.out.println("Quick Sort :");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ,  ");
    }

    public static void quickSort(int a[] , int lb , int ub){
        if(lb < ub){
       int pivot_point =  partition(a , lb , ub);
            quickSort(a , lb , pivot_point - 1);
            quickSort(a , pivot_point + 1 , ub);
        }
    }


    public static int partition(int a[] , int lb , int ub){

        int pivot = ub;

        int i = lb - 1;

        for(int j = lb; j < ub; j++ ){
            if(a[j] <= a[pivot]){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[ub] ;
        a[ub] = temp;


        return i + 1;

    }
}
