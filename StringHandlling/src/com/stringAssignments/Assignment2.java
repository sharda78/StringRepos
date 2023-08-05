package com.stringAssignments;
// 2.	Compare string using == when “” is present see same reference is there
public class Assignment2 {

	public static void compareString(String s3,String s4)
	{
		if(s3 == s4)
			System.out.println("Both Strings have same reference");
		else
			System.out.println("Both String have not same reference");
	
	}
	public static void main(String[] args) {
		String s1 = "String Handling";
		String s2 = "String Handling";
		
		compareString(s1,s2);

	}

}
