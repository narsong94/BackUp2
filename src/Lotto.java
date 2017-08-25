import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] nums = new int[6];

		Random rand = new Random();

		for (int i = 0; i < 6; i++)
			nums[i] = rand.nextInt(45) + 1;

		// �ʱ� ����
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println();

		// ����
		for (int j = 0; j < 5; j++) {
			for (int i = 0, tmp; i < 5 - j; i++) {
				if (nums[i] > nums[i + 1]) {
					tmp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = tmp;
				}
			}
		}

		// ���� ����
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", nums[i]);
	}

}
