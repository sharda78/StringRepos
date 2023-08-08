package com.stringHandlings;

public class ReverseString {
	public static void revString(String s1)
	{
		s1 = s1 + " ";
		String s2="",s3="";
		int len = s1.length();
		
		char ch;
		System.out.println("--------By Using Logic--------------");
		for(int i = 0; i < len; i++)
		{
			ch = s1.charAt(i);
			
			if(ch != ' ')
			{
				s2 = s2+ch;
			}
			else
			{
				s3 = s2 + " " + s3;
				s2 = "";
			}
		}
		System.out.println(s3);
	}
	public static void revString2(String str)
	{
		String sarr[] = str.split(" ");
		int i ,len = sarr.length;
		String newStr = "";
		
		System.out.println("\n-------By Using Split Method--------");
		for(i = len - 1; i >=0 ; i--)
		{
			newStr = newStr + sarr[i] + " ";
		}
		System.out.println(newStr);
	}

	public static void main(String[] args) {
		String s = "Computer Is Fun";
		revString(s);
		revString2(s);
	}

}
