package com.kaka.group.binarysearch;

public class MajorityElementI {

    public static void main(String args[]){
        int a[]  = {2, 3, 9, 2, 2};
       int k = findMajority(a);
       System.out.println("The Result ====>" +k);

        int aa[]  = {2, 3, 1, 4 };
        int kk = findMajority(aa);
        System.out.println("The Result ====>" +kk);
    }
    public static int findMajority(int a[] ){
        int major = a.length / 2 ;
        int result = 0;
        int count = 0;

        for(int i = 0 ; i < a.length; i++){
            count = 1;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] == a[i]){
                    count++;
                }
                if(count > major){
                    result = 1;
                    break;
                }
            }

        }
        return result;
    }
}
