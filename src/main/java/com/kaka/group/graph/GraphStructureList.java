package com.kaka.group.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphStructureList {

    static Map<Integer , List<Integer>>  graphMap = new HashMap<>();

    public static void main(String args[]){
        addPathBiDirectional(6 ,2);
        addPathBiDirectional(6 ,1);
        addPathBiDirectional(6,5);
        addPathBiDirectional(1 ,4);
        addPathBiDirectional(5 ,4);
        addPathBiDirectional(3 ,null);

        getAllVertAndEdges();

    }

    public static void addPathBiDirectional(Integer vert , Integer path){

        graphMap.computeIfAbsent(vert , e -> new ArrayList<>()).add(path);
        graphMap.computeIfAbsent(path , e -> new ArrayList<>()).add(vert);

    }

    public static void getAllVertAndEdges(){

        graphMap.entrySet().stream().forEach( e ->
                System.out.println(
                        "The Vert :" +e.getKey() + " The Edge :" + e.getValue()
                )
        );



    }
}
