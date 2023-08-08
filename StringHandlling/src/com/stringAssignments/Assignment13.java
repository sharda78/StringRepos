package com.stringAssignments;

import java.util.Scanner;

/*
 13.	Write a Java program to count total number of words in a string.
 */
public class Assignment13 
{
	public static void countwords(String str)
	{
		char ch = ' ',ch2;
		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			ch2 = str.charAt(i);
			if(ch == ch2)
			{
				cnt++;
			}
			
		}
		System.out.println("Total number of words are: " + (cnt + 1));
	}

	public static void countnoofwords(String s3)
	{
		int len = s3.length(),cnt=0;
		char ch,ch2;
		for(int i = 0; i < len-1; i++)
		{
			 ch = s3.charAt(i);
			 ch2 = s3.charAt(i+1);
			 if(ch == ' ' && ch2 != ' ')
			 {
				 cnt++;
			 }
		}
			 System.out.println("total no of words are: " + cnt);
		
	}
	public static void main(String[] args) {
		String s1 = "          java is object   oriented programming language       "; // here count in between space
		
		System.out.println(s1.trim());
		String []words = s1.split("\\s+"); 
		
		int count  = words.length;
		System.out.println("\n----------Method1-------------");
		System.out.println("Total number of words in given string are: " + count);
		
		System.out.println("\n----------Method2--------------");
		countwords(s1.trim());
		
		System.out.println("\n-------Method3------------");
		countnoofwords(s1);
		
		
	}

}
