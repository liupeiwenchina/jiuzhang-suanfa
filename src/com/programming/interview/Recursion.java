package com.programming.interview;
//
public class Recursion {
	public static int recursion(int num) {
		if (num == 1) return 1;
		else num = num + recursion(num -1);
		return num;
		
	}
	
	//factorial
	
	public static int getFac(int num) {
		if (num == 1) return 1;
		else return num*getFac(num - 1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Recursion.recursion(2);
		System.out.println(num);
		
		int fac = Recursion.getFac(3);
		System.out.println("fac: " + fac);
	}

}
