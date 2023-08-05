package com.stringHandlings;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "Technology";
		
		String s3 = new String("Technology");
		String s4 = new String("Technology");
		
		System.out.println(s2 == s4);
		System.out.println(s2 == s3);
		
		System.out.println(s2.equals(s4));
	}

}
