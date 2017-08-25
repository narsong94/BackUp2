import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] nums = new int[6];

		Random rand = new Random();

		for (int i = 0; i < 6; i++)
			nums[i] = rand.nextInt(45) + 1;

		// 초기 상태
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println();

		// 과정
		for (int j = 0; j < 5; j++) {
			for (int i = 0, tmp; i < 5 - j; i++) {
				if (nums[i] > nums[i + 1]) {
					tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
				}
			}
		}

		// 최종 상태
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", nums[i]);
	}

}
