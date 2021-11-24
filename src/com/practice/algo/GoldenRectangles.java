package com.practice.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldenRectangles {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of rectangles: ");
        int n=Integer.parseInt(br.readLine());
        int count=0;
        double h,w;
        for (int i=0;i<n;i++){
            System.out.println("Enter height: ");
            h=Integer.parseInt(br.readLine());
            System.out.println("Enter width: ");
            w=Integer.parseInt(br.readLine());;

            if(h>w){
                if(h/w>=1.6 && h/w<=1.7){
                    count++;
                }
            }
            else{
                if(w/h>=1.6 && w/h<=1.7){
                    count++;
                }
            }
        }
        System.out.println("Number of golden rectangles : "+count);
    }

}
