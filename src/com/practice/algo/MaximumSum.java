package com.practice.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Array Size: ");
        int n=Integer.parseInt(br.readLine());
        int array[]=new int[n];
        int sum=0,count=0;
        System.out.println("Enter values: ");
        for (int i=0;i<n;i++){
            array[i]=Integer.parseInt(br.readLine());
        }
        for (int i=0;i<n;i++){
            if (array[i]>0){
                sum+=array[i];
                count++;
            }
        }
        System.out.println("Sum : "+sum+" Number of elements: "+count);

    }
}
