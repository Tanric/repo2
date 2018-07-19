package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IdEvaluator {
	Pattern pattern;
	Matcher matcher;
	private String regex="^\\d{3}-\\d{2}-\\d{4}$";
	public IdEvaluator() {
		pattern =Pattern.compile(regex);
	}
	private boolean validate(String input) {
		boolean valid=false;
		matcher=pattern.matcher(input);
		valid =matcher.matches();
		return valid;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id:");
			String input=sc.nextLine();
			IdEvaluator idv=new IdEvaluator();
			boolean valid= idv.validate(input);
			System.out.println("Id valid:"+ valid);
			
		}

}
