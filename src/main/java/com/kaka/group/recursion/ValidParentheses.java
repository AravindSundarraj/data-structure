package com.kaka.group.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    static Map<Character, Character> hash = new HashMap<>();


    public static void main(String args[]) {

/*      hash.put('(' , ')');
        hash.put('{' , '}');
        hash.put('[' , ']');*/
        hash.put(')', '(');
        hash.put('}', '{');
        hash.put(']', '[');
        boolean b6 = valid("){");

        boolean b1 = valid("()");
        boolean b2 = valid("()[]{}");
        boolean b3 = valid("(}");
        boolean b4 = valid("([)]");
        boolean b5 = valid("{[]}");
        boolean b7 = valid("((");
      //  boolean b6 = valid("{[]}");

        System.out.println(b1 +" , " + b2 + " , " + " , " + b3
        + " , " + b4 + " , " +b5+ " , " +b6+ " , " +b7);
    }

    public static boolean valid(String s) {
// {()}  -- (}){
        if(s.length() == 1)
            return false;
        Stack<Character> stack = new Stack();
        int len = s.length();
        for (int i = 0; i < s.length(); i++) {

            Character c = hash.get(s.charAt(i));
            if (c == null) {
                stack.push(s.charAt(i));
            }
           else if (stack.size() !=0 && stack.peek().compareTo(c) == 0) {
                stack.pop();
                continue;
            } else {
                return false;
            }


        }
        if(stack.size() > 0) return false;

        return true;
    }
}
