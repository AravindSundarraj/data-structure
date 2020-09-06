package com.kaka.group.linkedlist;

/*
Edge cases : one list can contains more values than other.
             one list can be empty or both can be empty.
             both the node value can be equal
 */
public class MergeSortedList {

    public static String _ = "test";
    public static void main(String args[]) {

        Node test = new Node(1);
        /*Node test1 = new Node(2);
        Node test2 = new Node(4);
        test.next = test1;
        test1.next = test2;*/

        Node testb = new Node(2);
        /*Node testb1 = new Node(3);
        Node testb2 = new Node(4);
        Node testb3 = new Node(5);
        testb.next = testb1;
        testb1.next = testb2;
        testb2.next = testb3;*/

      Node result =  merge(test , testb);

      while(result != null){
          System.out.print(result.val + " ---> ");
          result = result.next;
      }

    }

    public static Node merge(Node s1, Node s2) {

        if (s1 == null && s2 != null) return s2;
        else if (s2 == null && s1 != null) return s1;
        else if (s1 == null && s2 == null) return null;

        Node one = s1;
        Node two = s2;
        Node result = null;
        Node temp = null;
        Node resultTemp = null;
        while (one != null && two != null) {

            if (one.val < two.val || one.val == two.val) {
                temp = one;
                one = one.next;
            } else if (two.val < one.val) {
                temp = two;
                two = two.next;
            }

            if (result == null) {
                result = new Node(temp.val);
                continue;
            }
             resultTemp = result;
            while (resultTemp.next != null) {
                resultTemp = resultTemp.next;
            }
            resultTemp.next = new Node(temp.val);
        }

        if (one != null ) {
            resultTemp.next = one;

        } else if (two != null) {
            resultTemp.next = two;
        }

        return result;

    }

    private void test(){
        System.out.println("The Test");
    }


}
