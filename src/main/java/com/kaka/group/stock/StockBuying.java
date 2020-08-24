package com.kaka.group.stock;

public class StockBuying {

    public static void main(String args[]){

      // int max = getMax(new int[]{7,1,5,3,6,4});


    }

    //7,1,5,3,6,4
    public static int getMax(int price[]){
        int max_profit = 0;
        for(int i = 0; i < price.length - 1; i++){
            for(int j = i + 1; j < price.length; j++){
                int profit = price[j] - price[i];
                if(profit > max_profit){
                    max_profit = profit;
                }
            }
        }

        return max_profit;




    }



}
