package com.stringHandlings;
// == operator checks reference and .equals method check contain present in string
public class EqualityTest {

	public static void main(String[] args) {
		String s1 = "Technology";
		
		String s2 = "Technology";
		
		String s3 = s1;
		
		String s4 = "Python";
		
		System.out.println("s1 == s2 : " + (s1 == s2));//true
		
		System.out.println("s1 == s3 : " + (s1 == s3)); // true
		
		System.out.println("s1 == s4 : " + (s1 == s4)); //false
	}

}
