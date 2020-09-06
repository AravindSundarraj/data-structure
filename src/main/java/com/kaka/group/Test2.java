package com.kaka.group;

public class Test2 {

    public static void main(String args[]){
 String t = "1234";
        String k = beautify(t);
        System.out.println(k);

        String tt = "91011";
        String kk= beautify(tt);
        System.out.println(kk);
    }

    public static String beautify(String s){

        String ss = "Yes";

        for(int i = 1 ; i < s.length(); i++){
            int kk = s.charAt(0) + 1;
            System.out.println("kkk ==" +kk);

            if(s.charAt(i) - s.charAt(i - 1) == 1){
                continue;
            }
           // else if(s.charAt())
            else{
                ss = "No";
            }
        }
        return ss;

    }
}
