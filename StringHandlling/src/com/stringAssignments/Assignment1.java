package com.stringAssignments;
//1.	String create with “” and with new operator

//Here,2object are created in SCP and 1 object created in Heap memory having reference s2
public class Assignment1 {

	public static void main(String[] args) {

		String s1 = "This is a String";
		String s2 = new String("By using new operator");
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
