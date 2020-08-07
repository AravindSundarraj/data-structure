package com.kaka.group.java8.interfaces;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String args[]){

        Supplier<String> s = ( () -> {
          return  "Krish".toUpperCase();

        });
        System.out.println(s.get());
    }
}
