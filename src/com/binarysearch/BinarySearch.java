package com.binarysearch;

public class BinarySearch {
	
	public static int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) 
			return -1;
		
		int start = 0;
		int end = nums.length - 1;
		
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				start = mid;
			else end = mid;
		}
		
		if (nums[start] == target)
			return start;
		else if (nums[end] == target)
			return end;
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,5,6,10};
		int target = 4;
		int index = BinarySearch.search(nums, target);
		System.out.println(index);
	}

}
