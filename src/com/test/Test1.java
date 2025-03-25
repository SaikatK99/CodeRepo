package com.test;
// check palindrome string using recursion
public class Test1 {
    public static void main(String[] args) {
        String value="abbacas";

        char arr[]=new char[value.length()];
        int j=0;
        int flag=0;
        for (int i=value.length()-1;i>=0;i--){
            arr[j]=value.charAt(i);
            if (value.charAt(j)==value.charAt(i)){
                flag=0;
            }
            else {
                flag=1;
            }
            j++;
        }
        if (flag==0){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }
}
