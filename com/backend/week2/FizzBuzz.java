package com.backend.week2;

import java.util.Scanner;
import java.util.*;

public class FizzBuzz {
    public static void main(String args[]) {

        int number = 100;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Fizz ");
            } else if (i % 3 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i+" ");
            }
        }

    }
}
