package com.stringHandlings;

import java.util.Scanner;

public class CountFrequency {
	
	public static void countfreqn(String s4)
	{
		int i, len = s4.length(),count = 0;
		char ch3,ch4;
		String s5 = "hello";
		for(int j = 0; j < len ; j++)
		{
		ch3 = s5.charAt(j);
		
		for(i = 0; i < len; i++)
		{
			ch4 = s5.charAt(i);
			if(ch3 ==ch4)
			{
				count++;
			}
		}
		System.out.println(ch3 + " = " + count);
		}
	}

	public static void main(String[] args) {
		String s1 = "india is my country";
		String s3 = "hello";
		int i, len = s1.length(),count = 0;
		char ch1,ch2;
		Scanner sc = new Scanner(System.in);
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
		
		countfreqn(s3);
		
		
	}

}
