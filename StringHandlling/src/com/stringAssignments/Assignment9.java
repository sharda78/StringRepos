package com.stringAssignments;
// 

public class Assignment9 {

	public static void main(String[] args) 
	{
		String str = "Good@Mrng@Have@a good day !!";
        String[] arrOfStr = str.split("@", 4); 
 
        for (String a : arrOfStr)
            System.out.println(a);

	}

}
