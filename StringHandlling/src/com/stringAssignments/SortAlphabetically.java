package com.stringAssignments;

public class SortAlphabetically {

	public static void main(String[] args) {
		String names[]= {"navin","kaushal","keshav","nishank","subodh"};
		String temp;
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("the names in alphabeticaly");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		System.out.println("-----------Print first & last name by sorting------------");
		System.out.println("First Name: " + names[0]);
		System.out.println("Last Name: " + names[names.length-1]);

	}

	}


