package com.stringHandlings;

public class StringIndexOf {

	public static void main(String[] args) {
	String s1 = "Good Morning";
	String s2 = "siri is an indian girl.";
	int index1 = s1.indexOf('M');
	System.out.println(index1);
	
	index1 = s1.indexOf('j'); // if any char is not present returns -1
	System.out.println("index of char is " + index1); //giving index for 1st occurence
	//int index1 = s1.indexOf('M');
	
	//case2
	//int index2 = s1.indexOf('i',5);
	
	int index2 = s1.indexOf(105,5); // ('i',5);
	System.out.println("i = " + index2);
	
	int index3 = s1.lastIndexOf('i');
	System.out.println("i = " + index3);
	
	int index4 = s1.lastIndexOf('i', 9);
	System.out.println("i = " + index4);
	
	int index6  = s2.indexOf("indian");
	System.out.println(index6);
	
	int index7  = s2.indexOf("indian",12); //
	System.out.println(index7);
	
	int index8   = s2.lastIndexOf("girl");
	System.out.println(index8);

	}

}
