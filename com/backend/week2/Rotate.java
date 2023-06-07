package com.backend.week2;

public class Rotate {
    public static void main(String[] args) {
        int[] y={4,6,12,23,45,56,67};
        int N=y.length;
        int shift=3;
        for(int i=0;i<N;i++) {
            if (i < N - shift) {
                System.out.println(y[i + shift]);
            }
        }
        for(int i=0;i<shift;i++){
            System.out.println(y[i]);
        }
    }
}