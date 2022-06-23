package com.practice.java8Featutes.lamdaExpression;

public class FunctionalLambdaExample {
    public static void main(String[] args) {
        FunctionalInterface factorialFunction = (num)->{
            int fact=1;
            for (int i=1;i<=num;i++){
                fact=fact*i;
            }
            return fact;
        };
        System.out.println("Factorial value: "+factorialFunction.getValue(7));
    }
}
