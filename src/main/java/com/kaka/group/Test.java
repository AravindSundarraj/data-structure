package com.kaka.group;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {



    /*0,10

    0,1,2,3,4....10

    {0=1,1=1,2=2, 3=6,...}*/

    static Map<Integer , Integer> map = new HashMap<>();
    static List<Integer> list = new ArrayList<>();

    public static  void main(String args[]){

       /* for(int i =0; i <= 10; i++)
            list.add(getFactorial(i));*/
            //map.put(i , getFactorial(i));

        //
        List<Integer> ll = Arrays.asList(1,2,3,4,5);

       // 1,2,6,24,120

        ll.stream().forEach( e -> {
                    HashMap<Integer, Integer> hm   = new HashMap<>();
                    hm.put(e , getFactorial(e));

                   // System.out.println(" Fact => : " + e  + " : " + hm.get(e));


                }

        );

        Function<Integer , Integer>  key = (i) -> i;
        Function<Integer , Integer>  value = (i) -> getFactorial(i);

       Map<Integer , Integer> mapTest = ll.stream().collect(Collectors.toMap( (i) -> i , (i) -> getFactorial(i)));

        mapTest.entrySet().stream().forEach(

                (kk) -> System.out.println(kk.getKey() + " =====" + kk.getValue())
        );



        //map.entrySet().stream().
       //int k= Test.getFactorial(5);
      // System.out.println(k);
    }


    /*
    public static Integer factorial(int n) {

}
     */

  /*  public static int getFactorial8(int i){

    }*/

    public static int getFactorial(int i){

        // 4 * 3 * 2 * 1

        if(i == 0){
            return 1;
        }

        return i * getFactorial(i -1);



    }
}
