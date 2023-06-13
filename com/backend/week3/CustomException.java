package com.backend.week3;

 class ce extends RuntimeException{
    ce(String s){
        super(s);
        }
        }
 public class CustomException {
    public static void main(String[] args) {
        int x;
        try{
            x= 10/0;
            System.out.println(x);
        }catch(RuntimeException e){
            throw new ce("This is our customized Exception");
        }

    }
}