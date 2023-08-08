package com.stringHandlings;

import java.util.Scanner;
// ctrl+shift+t = shortcut of built in class

public class StringPatterns {
	public static void javapatterns(String s)
	{
		System.out.println("-------by using charAt-------------");
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(0) + " " + s.charAt(1));
		System.out.println(s.charAt(0) + " " + s.charAt(1) + " "+ s.charAt(2));
		System.out.println(s.charAt(0) + " " + s.charAt(1) +" " +  s.charAt(2) + " " + s.charAt(3));
		
		System.out.println("------By using substring----------");
		for(int i = 0; i <= s.length(); i++)
		{
			String s2 = s.substring(0, i);
			System.out.println(s2 );
		}
	
	}
	
	public static void namepattern1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String"); // sachin Ramesh tendulkar
		String s2 = sc.nextLine();
		char ch,ch1 = ' ';
		for(int j = s2.length()-1; j >= 0; j--)
		{
			 ch = s2.charAt(j);
			 System.out.print(ch);//print string all rev
		}
		
	}
	public static void namepatterns()
	{
		String s1 = "sachin ramesh tendulkar";
		int i,len = s1.length();
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
//		int index1 = s1.indexOf(len);
//		int index2 = s1.indexOf(index1);
//		System.out.println(index1 + " " + index2);
	}
	public static void main(String[] args) {
		String s1 = "JAVA";
		
		javapatterns(s1);
		namepattern1();
		namepatterns();
		
		System.out.println("------------Split method-----------");
		String s4 = "rose is : red";
		char ch[] = s4.toCharArray();
		
		System.out.println("Char Array");
		
		for(char c : ch)
		{
			System.out.println(c);			
		}
		
		String sarr[] = s4.split(":"); // here,split string form :
		for(String s : sarr)
		{
			System.out.print("\n" + s);
		}

	}

}
