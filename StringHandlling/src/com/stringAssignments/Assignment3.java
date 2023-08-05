package com.stringAssignments;
//3.	Compare string using new operator 
//		when new is present see different reference is there
public class Assignment3 
{
	public static void compareUsingNewOperator(String s3,String s4)
	{
		if(s3 == s4)
			System.out.println("Both Of Having Same Reference");
		else
			System.out.println("Both String have not same reference");
	}
	public static void main(String[] args) 
	{
		String s1 = new String("Core Java");
		String s2 = new String("Core Java");
		
		compareUsingNewOperator(s1,s2);
	}

}
