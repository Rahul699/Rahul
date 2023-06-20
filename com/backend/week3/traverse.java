package com.backend.week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class traverse {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("rahul");
        stringList.add("kumar");
        stringList.add("sai");
        stringList.add("teja");

        // Using a for loop
        System.out.println("Using a for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Using an enhanced for loop
        System.out.println("\nUsing an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }

        // Using an iterator
        System.out.println("\nUsing an iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Using forEach method
        System.out.println("\nUsing forEach:");
        stringList.forEach(element -> System.out.println(element));

        // Using parallel stream
        System.out.println("\nUsing parallel stream:");
        stringList.parallelStream().forEach(element -> System.out.println(element));
    }
}

