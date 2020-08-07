package com.kaka.group.java8.interfaces;


import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String args[]) {

        Consumer<String> con = (s) -> System.out.println(" Tell me ..." + s);
        testConsumer(con);

    }

    public static void testConsumer(Consumer<String> s ) {

        s.accept("Rama");
        //System.out.println(" Test it ====>" +s.accept(););

    }


}
