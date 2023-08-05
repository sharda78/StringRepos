package com.stringHandlings;

public class PrintVowels {
	
	public static void testAllVowel(String s)
	{
		int len = s.length();
		
		char ch;
		for(int i = 0; i < len; i++)
		{
			ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				System.out.println(ch);
			}
		}

	}
	
	public static void testAllVowels(String s)
	{
		int len = s.length();
		
		char ch;
		for(int i = 0; i < len; i++)
		{
			ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				System.out.println(ch + " is vowel");
			}
			else
			{
				System.out.println(ch + " is not vowel");
			}
		}

	}

	public static void main(String[] args) {
		String s1 = "welcome";
		testAllVowels(s1);
		System.out.println("\n----Vowels-----");
		testAllVowel(s1);
		
	}

}
