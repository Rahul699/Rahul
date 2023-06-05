package com.backend.week1;


public class question2 {
    int x;

}
class  question1 extends question2{

    String y;
    int Z;


    public  question1(int X, String  Y) {

        x=X;
        y=Y;
    }


    public  question1(int z){
        Z= z;
    }
    public static void main(String[] args) {
        question1 q=new question1(5,"Rahul");
        question1 q2=new question1(10);


        System.out.println(q.x);
        System.out.println(q.y);
        System.out.println(q2.Z);




    }


}
