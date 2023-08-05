package com.stringHandlings;

public class TrimMethod {

	public static void main(String[] args) {
		String s1 = "   India  is my country      ";
		
		int len = s1.length();
		
		System.out.println(len);
		System.out.println(s1);
		
		
		System.out.println(len);
		System.out.println(s1.trim());
	}

}
