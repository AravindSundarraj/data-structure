package com.kaka.group.sort;

/*
Steps:
1. find the max element in array
2.  create an array called count. add the number of occurance of each element, index will be the value of original array
        eg int a[] = {0 , 1,1}
        count [] = new [a.length + 1];
        count[0] = 1 - > total count of value 0 is 1.
        count[1] = 2 - > total count of value 1 is 2.
3. modify the count array to index positions.
count[0] = 1
count[1] = 2 + 1 = 3

4. travse the original array in reverse order and store the sort order in another array
o[2] = 1;
go to 1 positions of count array we will have 3, decrement by one 3-1 =2 , store the value in 2nd postion
of sorted array;
 */


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
