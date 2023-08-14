package com.stringHandlings;

public class ConcatMethod {

	public static void main(String[] args) {
		String s1 = "welcome";
		
		s1.concat(s1); //heap =welcome to TQ   -unref(going for GC)   | scp to TQ
		
		System.out.println(s1);
		
		s1 = s1.concat(" to pune"); //heap -welcome to pune(ref by s1) | SCP to pune
		System.out.println(s1); // welcome to pune

		System.out.println("\n--------------------------------");
		
	  	




	}

}
