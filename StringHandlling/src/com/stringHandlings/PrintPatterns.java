package com.stringHandlings;

public class PrintPatterns {

	public static void printnamepatterns(String s)
	{
		int i;
		int len = s.length();
		s = s.toUpperCase();
		int index1 = s.indexOf(' ');
		int index2 = s.lastIndexOf(' ');
		System.out.println(s.charAt(0)+"."+s.charAt(index1+1) +"."+s.charAt(index2+1)+"."); //S.R.T
	}
	public static void main(String[] args) {
		String str1 = "sachin ramesh tendulkar";
		printnamepatterns(str1);
	}

}
