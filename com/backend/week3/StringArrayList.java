package com.backend.week3;

import java.util.ArrayList;


public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("rahul");
        stringList.add("kumar");
        stringList.add("sai");
        stringList.add("teja");

        // Convert ArrayList to an Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the array elements
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}