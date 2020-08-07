package com.kaka.group.java8.interfaces;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String args[]){

        Function<String , Integer>  funTest = ((i) -> {
            String s = new String(i);
            return Integer.parseInt(s);
        } );

        int  i = funTest.apply("1234");
        System.out.println("The int i =====> " +i);
    }
}
