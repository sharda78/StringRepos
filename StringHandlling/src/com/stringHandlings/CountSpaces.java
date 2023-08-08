package com.stringHandlings;

public class CountSpaces {
	public static void count(String s)
	{
		char ch1 = ' ',ch2;
		
		int cnt = 0;
		for(int i= 0; i < s.length(); i++)
		{
			ch2 = s.charAt(i);
			if(ch2 == ch1)
			{
				cnt++;
			}
		}
		System.out.println("Number of Spaces are : " + cnt);
	}

	public static void main(String[] args) {
		String s1 = "Java is platform independent language";
		
		
		count(s1);
	}

}
