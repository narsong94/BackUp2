package functions;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] nums = new int[6];
		
		genLotto(nums);
		printLotto(nums);
		sortLotto(nums);
		printLotto(nums);
	}

	private static void sortLotto(int[] nums) {
		for (int j = 0; j < 5; j++) {
			for (int i = 0, tmp; i < 5 - j; i++) {
				if (nums[i] > nums[i + 1]) {
					tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
				}
			}
		}

	}

	private static void printLotto(int[] nums) {
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println();

	}

	private static void genLotto(int[] nums) {
		Random rand = new Random();
		// 난수 발생
		for (int i = 0; i < 6; i++)
			nums[i] = rand.nextInt(45) + 1;

	}
}
