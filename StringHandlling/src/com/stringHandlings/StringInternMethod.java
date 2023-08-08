package com.stringHandlings;

public class StringInternMethod {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = s1.intern();
		
		System.out.println(s1==s2); // false bcoz s1 and s2 have ref are diff
		
		String s3 = "xyz";
		String s4 = new String("xyz");
		
		String s5 = s4.intern();
		
		System.out.println(s3 == s5); // true bcoz both s3 ans s5 pointing to same memory location.
	
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println( str1 == str2); // false..here it will check refeence
		System.out.println( str1.intern() == str2.intern()); // here,compiler will check SCP(objects)
		
	
	}

}
