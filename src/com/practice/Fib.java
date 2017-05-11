package com.practice;

public class Fib {
	public static int fibo(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		else return fibo(n -1) + fibo(n -2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(fibo(10));
	}

}
