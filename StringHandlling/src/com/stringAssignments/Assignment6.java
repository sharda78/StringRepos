package com.stringAssignments;
//6.	Write a Java program to compare two strings.
// equals method return boolean value and "==" return int
public class Assignment6 
{
	public static void compareString(String s4,String  s5, String s6)
	{
		
	}

	public static void main(String[] args) 
	{
		String s1 = new String("Python");
		String s2 = new String("Java");
		String s3 = new String("Python");
		
		System.out.println("Compare two String: " + s1.compareTo(s2));
		System.out.println("Both String are equal: " + s1.compareTo(s3));
	}

}
// if s1 is smaller than s2 then result will be positive
//if s1 == s2 then 0;
//if s1 is greater than s2 then result us negative number