package _10000;

import java.util.Scanner;

public class _1443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[6];

		
		
		for (int i = 0; i < nums.length; i++) {
			int Key =  sc.nextInt();
			int prev = i - 1;
			
			while (prev >= 0 && nums[prev] > Key) {
				nums[prev + 1] = nums[prev];
				prev--;
			}

			nums[prev + 1] = Key;
		}

		for (int num : nums) {
			System.out.println(num + " ");
		}
	}
}