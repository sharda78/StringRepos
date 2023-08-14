package com.stringAssignments;

public class CountLetterFrequency {
	public static void countFrequency(String s1)
	{
		s1  = s1.toLowerCase();
		for(char ch ='a'; ch >= 'z'; ch++)
		{
			int count = 0;
			for(int  i = 0; i < s1.length(); i++)
			{
				if(ch == s1.charAt(i))
				{
					System.out.println(ch);
				}
				if(ch != 0)
				{
					System.out.println(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "CORE JAVA";
		countFrequency(str);
		
	}

}
