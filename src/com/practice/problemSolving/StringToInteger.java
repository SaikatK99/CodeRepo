package com.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToInteger {
    public static int myAtoi(String str){
        int sign=1;
        int count=0;
        int len=str.length();
        int result=0;
        if(count<len && str.charAt(count)==' '){
            count++;
        }
        if (count<len && str.charAt(count)=='-'){
            sign=-1;
            count++;
        }else if(count<len && str.charAt(count)=='+'){
            sign=1;
            count++;
        }
        while (count<len && Character.isDigit(str.charAt(count))){
            int digit=str.charAt(count)-'0';
            result=result*10+digit;
            count++;
        }
        return result*sign;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String str=bufferedReader.readLine();
        System.out.println(myAtoi(str));
    }
}
