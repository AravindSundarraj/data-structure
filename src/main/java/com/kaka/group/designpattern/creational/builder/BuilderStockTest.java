package com.kaka.group.designpattern.creational.builder;

public class BuilderStockTest {

    public static void main(String args[]){

        Stock s = new Stock.StockBuilder().ceo("Aravind").company("KAKA").build();
        System.out.println("The Stock : " +s);

    }
}
