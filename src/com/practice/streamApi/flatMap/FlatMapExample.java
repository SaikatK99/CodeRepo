package com.practice.streamApi.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));

        // Sum of all the numbers in the list of a list
        List<Integer> no= numbers.stream().
                flatMap(number-> number.stream()).collect(Collectors.toList());
        Integer sum=no.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum : "+sum);

    }
}
