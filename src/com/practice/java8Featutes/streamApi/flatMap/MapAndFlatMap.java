package com.practice.java8Featutes.streamApi.flatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

    public static void main(String[] args) {

        List<Customer> customers=CustomerData.getAllCustomerData();

        // List<Customer> convert List<String> -> Data Transformation
        // mapping 1 customer -> customer.getName()
        List<String> customerNames=customers.stream().map(customer -> {
            return customer.getName();
        }).collect(Collectors.toList());
        System.out.println(customerNames);

        //List of a List
        List<List<String>> phoneNumbers = customers.stream().
                map(customer -> customer.getPhoneNumbers()).
                collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //Stream of Stream -> one to many mapping, It converts stream of a stream into single stream
        //  [[],[],[],[]] -> [,,,,]
        List<String> numbers= customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
