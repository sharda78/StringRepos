package com.stringAssignments;

public class DupWordsFreqOfWords 
{
	public static void freq(String s)
	{
		int len = s.length();
		int i;
		
		int count = 0;
		char ch1,ch2;
		s = s.trim();
		
		for(i = 0; i < len-1; i++)
		{
			ch1 = s.charAt(i);
			ch2 = s.charAt(i+1);
			if(ch1 != ' '  &&  ch2 == ' ')
			{
				count++;
			}
		}
		System.out.println("no of words: " + (count + 1) );
		
	}
	public static void duplicatewords(String s2)
	{
		int len = s2.length();
		String []str = s2.split(" ");
		//for(String s : str)
		//System.out.println(s);
		System.out.println("\nDuplicate Words Are: ");
		for(int i = 0; i < str.length; i++)
		{
			int cnt = 1;
			for( int j = i+1; j < str.length; j++)
			{
			
				if(str[i].equals( str[j] ))
				{
					cnt++;
					str[j] = "";
				}
				
			}
			if(cnt > 1 && str[i] != "")
			{
				System.out.println(str[i] + " = " + cnt);
			}
		}
	}

	public static void main(String[] args) {
	String s1 = "I am Happy because I saw the other are Happy";
	freq(s1);
	duplicatewords(s1);

	}

}
