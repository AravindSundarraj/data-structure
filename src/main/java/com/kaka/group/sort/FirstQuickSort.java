package com.kaka.group.sort;

public class FirstQuickSort {

    public static void main(String args[]){

        int a[] = {7, 2, 1, 8, 6, 3, 5, 4};
        sort(a , 0 , a.length - 1);


        System.out.println("Sort");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ,  ");
        }

    }

    public static int partition(int a[] , int lb , int ub){

        int pivot = a[lb];
        int i = lb ;
        int j = lb + 1;
        for( ; j < ub; j++){
            if(a[j] <= pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
         a[i + 1] = pivot;
         a[lb] = temp;

         System.out.println("Partition ==");
         for(int y = 0; y < a.length; y++ ){
             System.out.print(" , " +a[y]);
         }

         return i + 1;


    }

    public static void sort(int a[] , int lb, int ub){
        if(lb < ub){
         int p =   partition(a , lb ,ub);
            sort(a ,lb , p - 1);
            sort(a, p+1 , ub);
        }


    }
}
