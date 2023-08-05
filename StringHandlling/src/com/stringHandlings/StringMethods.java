package com.stringHandlings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "hello , hi";
		String s2 = "WELCOME";
		
		s1.toUpperCase(); //unreference vari goes into GC
		System.out.println(s1); //hello
		
		
		//case 1
		s1 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s1.toUpperCase());//HELLO
		
		
		System.out.println(s2.toLowerCase());

		//length
		System.out.println(s1.length()); //5
		int len = s1.length();
		System.out.println("length of s1: " + len);
		System.out.println("length of s2: " + s2.length());
		
		//charAt(int index)
		
		//char ch = s1.charAt(1); //
		//char ch1 = s1.charAt(10); // java.lang.StringIndexOfBoundException
		//char ch2 = s2.charAt('W'); // java.lang.StringIndexOutOfBoundsException
		//System.out.println(ch2); 
		//System.out.println(ch); 
		
		char ch5 = s1.charAt(-1);
		System.out.println(ch5);
		
		char ch3 = s1.charAt(s1.length()-1);
		// char ch4 = s1.charAt(len-1);
		System.out.println("Char present at index 1 is " + ch3);
	}

}
