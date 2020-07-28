package com.kaka.group.linkedlist;

public class SimpleLinkedList {

    Node head;
    Node last;

    public static void main(String args[]){

        SimpleLinkedList s = new SimpleLinkedList();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.travse();
        s.remove(30);
        s.travse();
        s.addFirst(100);
        s.travse();

    }

    public void add(int val){
        if(head == null){
            head = new Node(val);
            return;
        }
        Node n = new Node(val);
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = n;
        last = temp.next;

    }

    public void travse(){
        Node temp = head;
        if(head == null){
            return;
        }
        System.out.print(temp.val + " , ");
        while(temp.next != null){
            System.out.print(" , " +temp.next.val);
            temp = temp.next;
        }
        System.out.println();
    }

    public void addFirst(int val){
        Node temp = head;
        head = new Node(val);
        head.next = temp;
    }

/*    public void addLast(int val){
        Node n = new Node(val);
        last.next = n;
    }*/

    public void remove(int val){
        Node temp = head;

        if(temp.val == val){
            head = temp.next;
        }
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;

        }
    }
}

class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}
