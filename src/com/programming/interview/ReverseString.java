package com.programming.interview;

public class ReverseString {
	
	public static String reverse(String s) {
		
		if (s == null || s.length() == 0)
			return s;
		
		return reverse(s.substring(1)) + s.charAt(0);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		
		System.out.println(reverse(s));

	}

}
