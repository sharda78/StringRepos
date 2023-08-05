package com.stringHandlings;

public class StringUsingLoop {

	public static void main(String[] args) {
		String s1 = "i love my india";
		s1=s1.toUpperCase();
		
		int i,len=s1.length();
		
		for(i = 0; i < len; i++)
		{
			System.out.println(s1.charAt(i) + " is present at index " + i);
		}
		
		System.out.println("------------------------------");
		String s2 = "hello";
		char ch;
		for(i = 0; i < len; i++)
		{
			ch = s2.charAt(i);
			System.out.println(s2.charAt(i) + " is present at index " + s2.indexOf(ch)); //s2.indexOf(ch,i)
		}

	}

}
