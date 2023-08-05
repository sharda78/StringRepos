package com.stringHandlings;
//compareToIgnoreCase return int value which is ignore case-sensative
public class CompareToIgnoreMethod {

	public static void main(String[] args) {

			String s1 = "welcome";
			String s2 = "WELCOME";
			
			System.out.println(s1.compareToIgnoreCase(s2));
			int a = s1.compareToIgnoreCase(s2);
			System.out.println("compareToIgnoreCase method : " + a);
			
			int b = s1.compareTo(s2);
			System.out.println("compareTo : " + b);

	}

}
