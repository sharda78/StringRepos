package com.stringHandlings;

public class ImmutabilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "india";
		String s2 = "india";
		String s3 = "india";
		
		System.out.println(s1 + "\n" + s2+ "\n" + s3);
		
		s1 = "usa";
		
		System.out.println( "\n" + s1 + "\n" + s2+ "\n" + s3);
	}

}
