package com.kaka.group.fibonacci;

public class FibonacciSeries {

    public static void main(String args[]) {
       int k = naiveSolution(9);
       System.out.println("The Result :" +k);
       long b = bestSolution(331);
        System.out.println("The best Result :" +b);
    }
// 0 1 1 2 3 5 8 13 21  34 55
    // if input is 0
    public static int naiveSolution(int a) {

        if (a <= 1) {
            return a;
        }

        return naiveSolution(a - 1) + naiveSolution(a - 2);

    }

    public static long bestSolution(int a) {


        if(a == 0) return 0;
        else if(a == 1) return 1;
        int temp = 0;


        long f [] = new long[a + 1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= a; i++){
            f[i] = f[i - 1] + f[i - 2];
            temp = i;
        }


        return f[temp];
    }
}
