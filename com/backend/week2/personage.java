package com.backend.week2;

import java.util.Scanner;

public class personage {
    public static void main(String ards[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if(age>=13 && age<=19) {
            System.out.println("He is a teen "+age);
        }else if(age<13) {
            System.out.println("he is a kid "+age);
        }else if(age>19) {
            System.out.println("He is an adult "+age);



        }
    }
}

