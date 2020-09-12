package com.kaka.group.binarysearch;

public class BinarySearch3 {

    public static void main(String args[]){
        int a[] = {1, 2, 3, 4, 5};
       int t = getIndexPosition(a , 2);
       System.out.println("ttt == >>" +t);

    }

    public static int getIndexPosition(int a[] ,int x){
        int start = 0;
        int end = a.length - 1;

        while(start <= end){


            int mid = start + (end - start) /2;



            if(x == a[mid]){
                return mid;
            }
           else if(x < a[mid]){
                end = mid  - 1;
            }
           else if(x > a[mid] ){
                start = mid + 1;

            }

        }

        return -1;
    }



         private  static int binarySearch(int arr[], int x)
        {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;

                // Check if x is present at mid
                if (arr[m] == x)
                    return m;

                // If x greater, ignore left half
                if (arr[m] < x)
                    l = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // if we reach here, then element was
            // not present
            return -1;
        }

}
