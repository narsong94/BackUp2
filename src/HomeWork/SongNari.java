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
			System.out.println("성적 입력? 0/1");
			System.out.print("입력 : ");
			num = scan.nextInt();
			switch (num) {
			case 0:
				avg = sum / cnt;
				System.out.printf("총점 : %d\n", sum);
				System.out.printf("평균 : %6.2f\n", avg);
				break start;
			case 1:
				do {
					if (kor < 0 || kor > 100) {
						System.out.print("범위(0~100) 초과 다시 작성 요망\n");
						cnt--;
						sum -= kor;
					}
					System.out.print("성적 : ");
					kor = scan.nextInt();
					System.out.printf("%d점 입력하셨습니다.\n", kor);
					sum += kor;
					cnt++;
				} while (kor < 0 || kor > 100);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
