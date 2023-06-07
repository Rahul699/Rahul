package com.backend.week2;

public class Largest {

    public static void main(String[] args) {
        int[] x={1,5,8,45,67,89};
        int largest=x[0];
        int smallest=x[0];
        for(int i=0;i<=x.length-1;i++){
            int constant=x[i];
            if(constant>largest)
                largest=constant;
            if(constant<smallest)
                smallest=constant;
        }
        System.out.println("largest:"+largest);
        System.out.println("smallest:"+smallest);


    }
}