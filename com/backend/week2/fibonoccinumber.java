package com.backend.week2;

import java.util.Scanner;

public class fibonoccinumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int num1 = 0, num2 = 1;

        int count = 0;

        while (count < number) {


            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
    }


}
