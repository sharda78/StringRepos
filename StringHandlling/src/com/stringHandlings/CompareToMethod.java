package com.stringHandlings;
// s1 == s2 => return 0
// s1 > s2 => return +ve num
//s2 > s1 => return -ve number
public class CompareToMethod {

	public static void main(String[] args) {
	String s1 = "a"; // 97
	String s2 = "c"; //98
	
	System.out.println(s1.compareTo(s2)); // return int -2
	
	int a = s1.compareTo(s2);
	
	System.out.println("a = " + a);
	if(a == 0)
	{
		System.out.println("both string are equal");
	}
	else
	{
		System.out.println("both string are not equal");
	}
	
	
	
	
	}

}
