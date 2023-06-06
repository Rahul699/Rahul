package com.backend.week2;

import java.util.Scanner;
public class reverseofnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the amount");
        int num = sc.nextInt();
        int reverse=0;
        while(num!=0){
            int remainder = num%10;
            reverse = reverse*10+remainder;
            num=num/10;
        }
        System.out.println("the reverse number is "+reverse);

    }
}
