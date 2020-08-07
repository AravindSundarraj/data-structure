package com.kaka.group.java8.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOper {

    static List<String> sample = new ArrayList<>(0);
   /* List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> ll = Arrays.asList(1, 2, 3 4, 5);
    List<Integer> lll = Arrays.asList(1, 2, 3 4, 5);*/
    static Stream<List<Integer>> ss = Stream.of(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(
            6, 7, 8, 9, 10
            ),
            Arrays.asList(11, 12, 13, 14, 15));

    static {
        sample.add("one");
        sample.add("two");
        sample.add("three");
        sample.add("four");
        sample.add("five");
        sample.add("six");
        sample.add("seven");
        sample.add("eight");
        sample.add("nine");
        sample.add("ten");
        sample.add("two");
        sample.add("nine");
    }

    public static void main(String args[]) {
        mapOperation(sample);
        flatMapOperation(ss);
        limitOperation(sample);
        skipOperation(sample);
        sortOperation(sample);
        distinctOperation(sample);
    }

    public static void mapOperation(List<String> list) {

        List<String> l = list.stream().filter(s -> s.startsWith("t")).map(ss -> ss.toUpperCase()).
                collect(Collectors.toList());

        System.out.println("Map output :" + l);

    }

    public static void flatMapOperation(Stream<List<Integer>> stream) {

        List<Integer> flatMap = stream.flatMap(s -> s.stream()).filter(n -> n % 2 == 0).
                collect(Collectors.toList());

        System.out.println("Flat Map ====>>" + flatMap);

    }

    public static void limitOperation(List<String> list){

        List<String> limit = list.stream().limit(2).
                collect(Collectors.toList());

        System.out.println("Limit =====> " +limit);

    }

    public static void skipOperation(List<String> list){
        List<String> skip = list.stream().skip(4).
                collect(Collectors.toList());

        System.out.println("Skip =====> " +skip);
    }

    public static void sortOperation(List<String>list){
        List<String> sort = list.stream().sorted().
                collect(Collectors.toList());

        System.out.println("Sort ====>>>" +sort);
    }

    public static void distinctOperation(List<String>list){
        List<String> distinct = list.stream().distinct().
                collect(Collectors.toList());

        System.out.println("Distinct ====>>>" +distinct);
    }

}
