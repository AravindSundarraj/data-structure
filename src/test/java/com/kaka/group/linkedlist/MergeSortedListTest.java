package com.kaka.group.linkedlist;

import org.junit.Test;

public class MergeSortedListTest {

    @Test
    public void test(){
        Node n = new Node(2);
        Node nn = new Node(1);
        MergeSortedList.merge(n , nn);
    }
}
