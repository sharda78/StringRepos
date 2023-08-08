package com.stringAssignments;

import java.util.Arrays;

//initilize string nd count no of duplicate words occuring in sentences
public class Practice {
	public static void countNoOfDupWordsOccour(String s1)
	{
		//int len = s1.length();
		String []str1 = s1.split(" ");
		
		for(int i = 0; i < str1.length; i++)
		{
			int cnt = 1;
			for(int j = i+1; j < str1.length; j++)
			{
				if(str1[i] .equals( str1[j] ))
				{
					cnt++;
					str1[j] = " ";
				}
			}
			if(cnt > 1 && str1[i] != " ")
			{
				System.out.println(str1[i] + " = " + cnt);
			}
		}
		
	}
	public static void countFreqnOfWords(String s1,String s2)
	{
		//int len = s1.length();
		String []str1 = s1.split(" ");
		String str2 = new String(s2);
		int cnt = 1;
		for(int i = 0; i < str1.length; i++)
		{
			
			
				if(str1[i].equals( str2 ))
				{
					cnt++;
					//str1[j] = " ";// to avoid visiting
					
				}
				
			}
		System.out.println(str2 + cnt);
//			if(cnt > 1 && str1[i] != " ")
//			{
//				System.out.println(str2 + " = " + cnt);
//			}
		}
		
	

	public static void main(String[] args) 
	{
		String str = "Java is programming language and java is object oriented language";
		System.out.println("-----Method1-----------");
		countNoOfDupWordsOccour(str);
		System.out.println("-----Method2-----------");
		countFreqnOfWords(str,"language");
		
		
		String s="i love india because i live in india";
		String s1[]=s.split(" ");
		System.out.println(Arrays.toString(s1));
		System.out.println("---finding count of words in string-----");
		// finding count of words in string

		int count;
		for(int i=0;i<s1.length;i++)
		{
			count=1;
            
			if(s1[i]=="-1")
				continue;
		
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]="-1";
				}

			}
			System.out.println(s1[i]+" "+count);
		}
		

	}

}
