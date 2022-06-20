package com.practice.problemSolving;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int a,sum=0,val=x;
        while (x>0){
            a=x%10;
            x=x/10;
            sum=sum*10+a;

        }
        if (val>0 && sum==val){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
