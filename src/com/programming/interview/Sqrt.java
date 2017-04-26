package com.programming.interview;

public class Sqrt {
	
	public static double sqrt(double n) {
		
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) return n;
		
		double precision = 0.000001; //define precision
		
		double start = 0;
		double end = n;
		//we define two points because usually 0< sqrt(n) < n
		//however if n <1, 0<n<sqrt(n)
		
		if (n<1) end = 1;
		
		//define a loop to continue if the precision is not yet reached
		while (precision< end - start) {
			double mid = (end + start)/2;
			double midsqr = mid * mid;
			if (midsqr == n) return mid;
			else if (midsqr < n) start = mid;
			else end = mid;
			
		}
		return (end+start)/2;
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sqrt of 50 is " + sqrt(50));
		System.out.println("sqrt of 100 is " + sqrt(100));
		System.out.println("sqrt of 0 is " + sqrt(0));

	}

}
