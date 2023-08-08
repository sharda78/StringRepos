package com.stringAssignments;

import java.util.Scanner;

/*
 14.	Write a Java program to find first occurrence of a word in a given string.
 */
public class Assignment14 
{

	public static void findfirstoccurance()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
	
		
		int i, len = s1.length(),count = 0;
		char ch1,ch2;

		System.out.println("Enter char for it's frequency");
		ch1 = sc.next().charAt(0);
		
		for(i = 0; i < len; i++)
		{
			ch2 = s1.charAt(i);
			if(ch1 ==ch2)
			{
				count++;
			}
		}
		System.out.println(ch1 + " = " + count);
		
	}
	public static void main(String[] args) 
	{
		findfirstoccurance();

	}

}
