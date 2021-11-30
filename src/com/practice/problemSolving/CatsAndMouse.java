package com.practice.problemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatsAndMouse {

    static void cat_mouse(int x, int y, int z) {
        int a, b;
        a = z - x;
        b = z - y;
        if (Math.abs(a) < Math.abs(b)) {
            System.out.println("Cat A");
        } else if (Math.abs(a) > Math.abs(b)) {
            System.out.println("Cat B");
        } else {
            System.out.println("Mouse C");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Query no: ");
        int no = Integer.parseInt(br.readLine());
        int arr[] = new int[3];
        int catA = 0, catB = 0, mouseC = 0;
        System.out.println("Enter location: ");
        for (int i = 0; i < no; i++) {
            catA = Integer.parseInt(br.readLine());
            catB = Integer.parseInt(br.readLine());
            mouseC = Integer.parseInt(br.readLine());
            cat_mouse(catA,catB,mouseC);
            System.out.println("Enter next location: ");
        }
    }
}
