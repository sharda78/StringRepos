package com.stringHandlings;

public class StringBufferClass {

	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer();
		
		//StringBuffer sb2 = "abc";
		System.out.println("Capacity: " + sb1.capacity());
		sb1.append("hello");
		System.out.println(sb1);
		System.out.println(sb1.capacity()); //16
		
		sb1.append("welcome hello");
		System.out.println(sb1.capacity()); // new = old_cap *2 +2;
		
		// new cap = (16 * 2) + 2 => 34
		// new cap2 = (34 * 2) + 2 => 70
		
		System.out.println(sb1);
		sb1.delete(2, 5);
		System.out.println(sb1);//hewelcome hello
		
		sb1.insert(2, "ti");
		System.out.println(sb1); // hetiwelcome hello
		
		sb1.replace(1, 6, "str");
		System.out.println(sb1);//hstrlcome hello
		
		

	}

}
