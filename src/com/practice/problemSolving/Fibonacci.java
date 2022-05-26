package com.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no: ");
        int x=0,y=1;
        int no=Integer.parseInt(bufferedReader.readLine());
        for (int i=0;i<no;i++){
            System.out.print(x+" ");
            int z=x+y;
            x=y;
            y=z;
        }
    }
}
