package com.backend.week2;

public class Reverse1 {
	StringBuilder myName = new StringBuilder("Pranay kumar");
	public void test() {
	
	int l=myName.length();
	for (int i=0;i<l/2;i++) {
		char temp=myName.charAt(i);
		myName.setCharAt(i,myName.charAt(l-i-1));
		
		myName.setCharAt(l-i-1,temp);
		
	}
	System.out.print(myName);
	}
	public static void main(String[] args) {
		
		Reverse1 r=new Reverse1();
		r.test();

	}

}
