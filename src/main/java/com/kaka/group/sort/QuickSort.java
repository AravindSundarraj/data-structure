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

        System.out.println("Upper bound ==>>" + hb);
        System.out.println("lower bound==>>" + lb);
        int pivot = a[lb];
        int start = lb;
        int end = hb;

        while(start < end) {
            System.out.println("The Start =>" +start);
            while (a[start] <= pivot) {
                start++;
                System.out.println("The Start =>" +start + "Pivot =>" +pivot + "Start value ==>>" );
            }

            while (a[end] > pivot) {
                end--;
            }

            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        //if(start > end){
            int temp = a[end];
             a[end] = a[lb];
             a[lb] = temp;

      //  }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "  ,  ");
        }
        System.out.println();
        return end;

    }




    public static void quickSorting(int a[] , int lb , int hb){
        if(lb < hb){
            int loc = partition(a , lb ,hb);
            quickSorting(a, lb , loc - 1);
            quickSorting(a ,loc+1 , hb);
        }

    }


}
