package com.stringHandlings;
//24.	Write a Java program to reverse order of words in a given string with palindrome
import java.util.Scanner;

public class WordsPalindrom {
	public static void reverseString(String s)
	{
	System.out.println("Given String : ");	
	System.out.println(s+"\n---------------------------");	
		String[] s2=s.split(" "); 
		String s3="";
		int i;
		
		
		System.out.println("After Reverse the String : ");
		for ( i = s2.length-1; i >=0; i--) {
			s3=s3+s2[i];
			System.out.println(s3);
		}
		System.out.println("--------------------------------");
		if(s.equals(s3))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
		
	}

		
	public static void main(String[] args) {
		String s1 = "thinkquotientthink";
		reverseString(s1);

	}

}
