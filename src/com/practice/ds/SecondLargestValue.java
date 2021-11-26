package com.practice.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestValue {
    
    public static void printSecondLargest(int[] arr, int arr_size){
        int largest,secondLarge;
        largest=secondLarge=Integer.MIN_VALUE;

        if(arr_size<2){
            System.out.println("Invalid Array ");
        }
        for (int i=0;i<arr_size;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        for (int i=0;i<arr_size;i++){
            if (arr[i]!=largest){
                secondLarge=Math.max(secondLarge,arr[i]);
            }
        }
        if (secondLarge==0){
            System.out.println("There is no second largest number ");
        }
        else {
            System.out.println("Second Largest value : "+secondLarge);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Array size: ");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("Enter Positive Values: ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
       printSecondLargest(arr,n);
    }
}
