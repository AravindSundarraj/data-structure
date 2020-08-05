package com.kaka.group.java8;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupByTest {

   static  List<GroupByTest.Account> accountList = new ArrayList<>();
    static{

        accountList.add(new Account(34563 , "Rob" ,"USD"));
        accountList.add(new Account(5675 , "Rob" ,"USD"));
        accountList.add(new Account(666 , "Rob" ,"USD"));
        accountList.add(new Account(777 , "Rob" ,"EUR"));
        accountList.add(new Account(33 , "Rob" ,"EUR"));
        accountList.add(new Account(78 , "Rob" ,"INR"));
        accountList.add(new Account(9343 , "Rob" ,"INR"));
        accountList.add(new Account(93934 , "Rob" ,"YEN"));
        accountList.add(new Account(88888 , "Rob" ,"USD"));
        accountList.add(new Account(345171763 , "Rob" ,"AUS"));

    }

    public static void main(String args[]) {

        Map<String, List<Account>> masp = accountList.stream().collect(groupingBy(Account::getCurrencyCd));

        masp.entrySet().forEach(
                e -> {
                    System.out.println("key =>" + e.getKey() + "===" + e.getValue());
                }
        );


    }

    public static class Account{
        private int accountNo;
        private String accountHolderName;


        private String currencyCd;

        public Account(int accountNo , String accountHolderName , String currencyCd){
            this.accountNo = accountNo;
            this.accountHolderName = accountHolderName;
            this.currencyCd = currencyCd;
        }

        public void setAccountNo(int accountNo){
            this.accountNo = accountNo;
        }
        public int getAccountNo(){
            return this.accountNo;
        }
        public void setAccountHolderName(String accountHolderName){
            this.accountHolderName = accountHolderName;
        }

        public String getAccountHolderName(){
            return this.accountHolderName;
        }

        public void setCurrencyCd(String currencyCd){
            this.currencyCd = currencyCd;
        }

        public String getCurrencyCd(){
            return this.currencyCd;
        }

        public String toString(){


         return       "Name :" + this.accountHolderName + "Currency Code :  "
                 + this.currencyCd + "  AcNum :" +this.accountNo;

        }


    }
}

