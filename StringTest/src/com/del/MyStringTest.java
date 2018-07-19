package com.del;

public class MyStringTest {
	public MyStringTest() {
		String str="Hello";
		System.out.println("str is:"+str);
		modify(str);
		System.out.println("after modify str:"+str);
		StringBuilder sb=new StringBuilder("hello");
		modify(sb);
		System.out.println("sb:"+sb);
	}
	private void modify(StringBuilder sb) {
		sb.append("guys");
		//System.out.println("here str:"+sb);
	}
	private void modify(String str) {
		str=str.concat("guys");
		System.out.println("here str:"+str);
	}
	public static void main(String[] args) {
		new MyStringTest();
	}

}
