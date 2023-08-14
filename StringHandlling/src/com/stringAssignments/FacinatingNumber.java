package com.stringAssignments;

import java.util.Scanner;

public class FacinatingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num < 100)
		{
			System.out.println(num + "is not facinating number");
		}
		for(int i = 1 ; i < 4; i++)
		{
			int newnumber = num * i;
			System.out.println(num + " * " + i + " = " + newnumber);
		}
		

	}

}
