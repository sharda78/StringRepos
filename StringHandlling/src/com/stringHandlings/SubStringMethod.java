package com.stringHandlings;

public class SubStringMethod {

	public static void main(String[] args) {
		String s1 = "ThinkQuotient";
		
		String s2 = s1.substring(5); //traverse -begin index
		
		//traverse from begin index to end or len-1
		
		String s3 = s1.substring(0,5);
		//start with begin index and goes till endindex-1
		System.out.println(s3);
		System.out.println(s2);
	}

}
