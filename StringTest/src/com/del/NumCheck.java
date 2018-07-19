package com.del;

import java.util.Scanner;

public class NumCheck {
	public static void main(String[] args) {
	int digits=5;
	int d=0;
	System.out.println("Enter a "+digits+" digit number");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	int e=input;
	while(input!=0) {
		input=input/10;
		d=d+1;
		
	}
	System.out.println("No. of digits u entered is:"+d);
	if(d==5) {
		System.out.println(e+" is a 5 digit number");
	}
	else
		System.out.println("Not a 5 digit no.");
/*	if(input.length()==5) {
		System.out.println("it has 5 digits");
		
	}
	else
		System.out.println("does not have 5 digits");
		*/
//	boolean valid= input.matches("\\d{"+digits+"}");
//	System.out.println("valid:"+valid);
	 
	
	
}
}
