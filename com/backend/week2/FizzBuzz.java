package com.backend.week2;

import java.util.Scanner;
import java.util.*;

public class FizzBuzz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        for(int i=1;i<=number;i++) {
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz"+i);
            }else if(i%5==0) {
                System.out.println("Fizz"+i);
            }else if(i%3==0) {
                System.out.println("Buzz"+i);
            }else {
                System.out.println("not a fizz number"+i);
            }
        }
        sc.close();
    }

}