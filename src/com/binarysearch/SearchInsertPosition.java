package com.binarysearch;

//[1,2,3,4], 3 => 2
public class SearchInsertPosition {

	public static int searchInsert(int[] A, int target) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int start = 0;
		int end = A.length - 1;

		int mid = start + (end - start) / 2;
		while (start + 1 < end) {
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				start = mid;
			} else {
				end = mid;
			}
		}

		if (A[start] >= target) {
			return start;
		} else if (A[end] >= target)
			return end;
		else {
			return end + 1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] { 1, 2, 3, 4 };
		int target = 6;
		int position = searchInsert(A, target);
		System.out.println(position);
	}

}
