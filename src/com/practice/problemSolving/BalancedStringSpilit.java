package com.practice.problemSolving;

import java.io.IOException;

public class BalancedStringSpilit {

    public static int balanceSpilitString(String s){
        int balance=0,spilit=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            balance=balance+(ch=='L'? -1 : 1);
            if (balance==0){
                spilit++;
            }
        }
        return spilit;
    }

    public static void main(String[] args) throws IOException {
       String str="RLRRRLLRLRL";
        System.out.println(balanceSpilitString(str));
    }
}
