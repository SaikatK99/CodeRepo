package com.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

    public static String stringReverse(String str){
        char arr[]=str.toCharArray();
        char arr2[]=new char[str.length()];
        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            arr2[count]=arr[i];
            count++;
        }
        return String.valueOf(arr2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String st=bufferedReader.readLine();
        System.out.println(stringReverse(st));
    }
}
