package com.backend.week1;

interface  assignment1 {
    public int add(int a, int b);

}
interface assignment2{
    public void bus();
}
public  class assignment implements assignment1,assignment2{

    public int add(int a, int b) {
        return a+b;


    }
    public void bus() {
        System.out.println("hi");
    }
    public static void main (String[] args) {
        assignment A=new assignment();
        int x=A.add(2,3);
        A.bus();
        System.out.println(x);
    }


}
