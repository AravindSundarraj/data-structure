package com.kaka.group.java8.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {


   static List<Integer> twoList = new ArrayList<>();

   static{
       twoList.add(2);
       twoList.add(4);
       twoList.add(5);
       twoList.add(6);
       twoList.add(8);
       twoList.add(10);
       twoList.add(7);
       twoList.add(13);
       twoList.add(19);
   }

    public static void main(String args[]){

        Predicate<Integer> predicate = (i -> {
            if( i % 2 == 0) return true;
            else return false;
        });

        Function<Integer , Integer> functionValue = (key -> {
           int u = key * 4 ;
           return u;
        });

     Map<Integer , Integer> map =
             twoList.stream().filter(predicate).collect(Collectors.toMap( i -> i , functionValue ));
     map.entrySet().stream().forEach(e ->{
         System.out.println("Key :" + e.getKey() + "====== " + e.getValue());
     });

    }


}
