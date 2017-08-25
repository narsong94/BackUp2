package functions;
import java.util.Scanner;

public class Reply {
	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);

		나돌아갈래: 
		while (true) {
			System.out.println("┌─────────────────────┐");
			System.out.println("│	 메인 메뉴	      │");
			System.out.println("└─────────────────────┘");

			System.out.print("\n1.성적 입력\n2.성적 출력\n3.종료\n\n선택 > ");
			num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.println("┌─────────────────────┐");
				System.out.println("│	 성적 입력	      │");
				System.out.println("└─────────────────────┘");

				do {
					if (kor < 0 || kor > 100)
						System.out.print("범위 ㄴㄴ\n");
					System.out.print("국어 : ");
					kor = scan.nextInt();
				} while (kor < 0 || kor > 100);
				do {
					if (eng < 0 || eng > 100)
						System.out.print("범위 ㄴㄴ\n");
					System.out.print("영어 : ");
					eng = scan.nextInt();
				} while (eng < 0 || eng > 100);
				do {
					if (math < 0 || math > 100)
						System.out.print("범위 ㄴㄴ\n");
					System.out.print("수학 : ");
					math = scan.nextInt();
				} while (math < 0 || math > 100);
				break;
			case 2:
				total = kor + eng + math;
				avg = total / 3;

				System.out.println("┌─────────────────────┐");
				System.out.println("│	 성적 출력	      │");
				System.out.println("└─────────────────────┘");

				for(int i=0; i<3; i++) {
					System.out.printf("국어 : %d\n", kor);
					System.out.printf("영어 : %d\n", eng);
					System.out.printf("수학 : %d\n", math);
					System.out.printf("총점 : %d\n", total);
					System.out.printf("총점 : %6.2f\n", avg);
					System.out.println("---------------------------");
				}
				break;
			case 3:
				break 나돌아갈래;
			default:
				System.out.print("잘못된 입력입니다. 번호 : 1 ~ 3\n");
			}
		}
	}
}
