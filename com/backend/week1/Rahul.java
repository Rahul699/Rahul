package com.backend.week1;


public class Rahul {

    static int x;
    static void equal(int y) {
        x=y;

    }
    static {
        equal(10);
    }
    public static void main (String[] args) {
        System.out.println(Rahul.x);

    }


}
