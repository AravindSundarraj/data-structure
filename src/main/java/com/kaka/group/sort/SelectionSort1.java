package com.kaka.group.sort;

public class SelectionSort1 {
    public static void main(String args[]){

        selectionSort(new int[]{1, 8 , 5 , 2, 4, 2});

    }

    public static void selectionSort(int[] a){
        // 8 5 2 4 2
        int position = 0;
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            int min_index = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[min_index]){
                    min_index = j;
                }
            }
            temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;

        }
        System.out.println("Selection Sort Result");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] +"   ");
        }
    }
}
