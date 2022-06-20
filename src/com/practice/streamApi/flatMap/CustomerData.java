package com.practice.streamApi.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerData {

    public static List<Customer> getAllCustomerData(){
        return Stream.of(
                new Customer(111,"John" ,"john@email.com", Arrays.asList("8754210210","7545210210")),
                new Customer(112,"Smith" ,"smith@email.com", Arrays.asList("8954214211","7952121001")),
                new Customer(113,"Peter" ,"peter@email.com", Arrays.asList("9754345210","6542210713")),
                new Customer(114,"Robert" ,"robert@email.com", Arrays.asList("8751210296","7125269840")),
                new Customer(115,"Steve" ,"steve@email.com", Arrays.asList("9854742010","7789210210"))
        ).collect(Collectors.toList());
    }
}
