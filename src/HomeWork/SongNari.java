package HomeWork;
import java.util.Scanner;

public class SongNari {
	public static void main(String[] args) {
		int kor = 0;
		int num = 0;
		int sum = 0, cnt = 0;
		float avg = 0;

		Scanner scan = new Scanner(System.in);

		start:
		while (true) {
			System.out.println("---------------------");
			System.out.println("���� �Է�? 0/1");
			System.out.print("�Է� : ");
			num = scan.nextInt();
			switch (num) {
			case 0:
				avg = sum / cnt;
				System.out.printf("���� : %d\n", sum);
				System.out.printf("��� : %6.2f\n", avg);
				break start;
			case 1:
				do {
					if (kor < 0 || kor > 100) {
						System.out.print("����(0~100) �ʰ� �ٽ� �ۼ� ���\n");
						cnt--;
						sum -= kor;
					}
					System.out.print("���� : ");
					kor = scan.nextInt();
					System.out.printf("%d�� �Է��ϼ̽��ϴ�.\n", kor);
					sum += kor;
					cnt++;
				} while (kor < 0 || kor > 100);
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
}
