package com.practice.problemSolving;

import java.io.IOException;


public class SumOfAnyTypeInput {

    static <T extends Number> T sumOfTwoInput(T x,T y){
       if (x instanceof Integer){
           return (T) new Integer(x.intValue()+y.intValue());
       }
       else if(x instanceof Float){
           return (T) new Float(x.floatValue()+y.floatValue());
       }
       else if(x instanceof Double){
           return (T) new Double(x.doubleValue()+y.doubleValue());
       }
        return null;
    }
    static <T extends String> T sumOfTwoInput(T x,T y){
        return (T) (x.toString()+y.toString());
    }

    public static void main(String[] args) throws IOException {
        System.out.println(sumOfTwoInput(51,62.7));
    }
}
