package com.stringAssignments;

import java.util.Scanner;

public class Assignment11 
{
	public static void countfreqn(String s4)
	{
		int i, len = s4.length();
		char ch3,ch4;
		String s5 = "hello";
		for(int j = 0; j < len ; j++)
		{
		ch3 = s5.charAt(j);
		int count=0;
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
		String s3 = "hello";
		
		countfreqn(s3);

	}

}
