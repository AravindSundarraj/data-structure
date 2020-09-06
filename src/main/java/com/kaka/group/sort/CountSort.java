package com.kaka.group.sort;

public class CountSort {

    public static void main(String args[]){

        int a[] = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,9};
        countSorting(a);

    }

    public static void countSorting(int [] a){
      int max =  findMax(a);
      int [] count = new int[max + 1];
      int [] result = new int[a.length];

      for(int i = 0; i < a.length; i++){
          count[a[i]]+=1;
      }
      for(int k = 1; k <=max; k++){
          count[k] = count[k] + count[k - 1];
      }

      for(int j = a.length -1; j >= 0; j--){
          result[--count[a[j]]] = a[j];
      }

      System.out.println("Result :");

      for(int r = 0; r < result.length; r++){
          System.out.print(result[r] + " , " );
      }

    }

    private static int findMax(int [] a){

        int max = 0;
        for(int i = 0; i < a.length; i++){

            if(a[i] > max) max = a[i];
        }
        return max;
    }
}
