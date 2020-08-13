package com.kaka.group.fibonacci;

public class LastDigitFibo {
    public static void main(String args[]){

      int u =  lastDigit(327305);
      System.out.println("the U ====>>>" +u);
    }

    private static final int lastDigit(int a){

        if(a <= 1){
            return a;
        }

        int temp = 0;


        int f [] = new int[a + 1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= a; i++){
            f[i] = (f[i - 1] + f[i - 2]) % 10;
            temp = i;
        }

        return f[temp];

    }
}
