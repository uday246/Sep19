package Sep17;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int target = 0;
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int[] arr;
		Solution test = new Solution();
		while (scnr.hasNext()) {
			arrList.add(scnr.nextInt());
		}
		arr = new int[arrList.size()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = arrList.get(i);
		int out = test.getIndex(arr, target);
		System.out.println(out);
	}

	private int getIndex(int[] nums, int target) {
		int l = 0, r = nums.length - 1;

		while (l <= r) {
			int m = l + (r - l) / 2;
			if (nums[m] == target)
				return m;
			if (nums[m] < target)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}
}
