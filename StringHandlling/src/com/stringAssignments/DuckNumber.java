package com.stringAssignments;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		String str;
		char ch;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		str = sc.nextLine();
		
		int len = str.length();
		
		if(str.charAt(0) == '0')
		{
			System.out.println(str + "is not Duck Number: " );
		}
		else
		{
			for(int i = 0; i < len; i++)
			{
				ch = str.charAt(i);
				if(ch == '0') //if it is found at any position
				{
					flag = 1; // defining value of k =1
					
					//System.out.println(ch + " is duck number");
				}
			}
			
				if(flag == 1)
				{
					System.out.println("Given no is duck number");
				}
				else
				{
					System.out.println("given no is not duck number");
				}
				
				
			}
		}
		
		

	

}
