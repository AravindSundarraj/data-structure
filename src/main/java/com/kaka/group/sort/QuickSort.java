package com.kaka.group.sort;

public class QuickSort {

    public static void main(String args[]){

        int sort [] = {7, 6, 10, 5, 9, 2, 1, 15, 7};

        quickSorting(sort , 0,sort.length - 1);

        System.out.println("Print the Sorted elements");

        for(int i = 0; i < sort.length; i++){
            System.out.print(sort[i] + " , ");
        }

    }

    public static int partition(int a[] , int lb , int hb){

        int pivot = a[lb];
        int i = lb - 1;

        for(int j = lb; j < hb; j++){
            if(a[j] <= pivot){
                ++i;
              int temp =  a[i] ;
              a[i] = a[j];
              a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i + 1] = pivot;
        a[lb] = temp;

        return i + 1;

    }




    public static void quickSorting(int a[] , int lb , int hb){
        if(lb < hb){
            int loc = partition(a , lb ,hb);
            quickSorting(a, lb , loc - 1);
            quickSorting(a ,loc+1 , hb);
        }

    }


}
