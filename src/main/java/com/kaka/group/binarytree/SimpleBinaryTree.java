package com.kaka.group.binarytree;

import java.util.Stack;

/*
what is Binary Tree?
It is a Tree Data Structure in which each node at most has two child node (left and right child node)

Balanced and UnBalanced Tree

Three ways to Traversing

1. InOrder Traversing - left node first then root node and then right note
2. PreOrder Traversing - first visit the Root node then left nodes , and then right nodes.
3. Post Order Traversing - left node first then right node and then root node

 */
public class SimpleBinaryTree {

    // 8 5 4 9 7 11 1 12 3 2
    public static void main(String args[]){
        Tree t1 = new Tree(8);
        //t1 left
        Tree t2 = new Tree(5);
        t1.left = t2;
        // t1 right
        Tree t3 = new Tree(4);
        t1.right = t3;

        // t2 left
        Tree t4 = new Tree(9);
        t2.left = t4;

        // t2 right

        Tree t5 = new Tree(7);
        t2.right = t5;

        // t3 left

        Tree t6 = new Tree(11);
        t3.left = t6;

        // t3 right

        Tree t7 = new Tree(1);
        t3.right = t7;

        // t4 left

        Tree t8 = new Tree(12);
        t4.left = t8;

        Tree t9 = new Tree(3);
        t4.right = t9;

        // t5 left
        Tree t10 = new Tree(2);

        t5.left = t10;

        // Traverse
        InOrdertraverse(t1);




    }

    public static  void InOrdertraverse(Tree root){
        //Create three stacks , left Stack
        Tree head = root;
        Tree LeftHead = root.left;
        Tree rightHead = root.right;
        Stack<Integer> stackLeft = new Stack();
        Stack<Integer> stackRight = new Stack();

        if(root == null){
            return;
        }

        while(LeftHead != null){

            stackLeft.push(LeftHead.left.value);
            stackLeft.push(LeftHead.value);
            stackLeft.push(LeftHead.right.value);
            LeftHead = LeftHead.left;
        }
        while(rightHead != null){
            System.out.println(rightHead.left.value);
            stackRight.push(rightHead.left.value);
            stackRight.push(rightHead.value);
            stackRight.push(rightHead.right.value);
            rightHead = rightHead.right;
        }



        for(int i = 0 ; i < stackLeft.size(); i++){
            System.out.print(stackLeft.pop() +" , ");
        }

        System.out.println();
        System.out.println(head.value);
        System.out.println();

        for(int k = 0 ; k < stackRight.size(); k++){
            System.out.print(stackRight.pop() +" , ");
        }


    }

    public void insert(int value){

    }
}


class Tree{
    int value;
    Tree left;
    Tree right;

    public Tree(int value){
        this.value = value;
    }
}
