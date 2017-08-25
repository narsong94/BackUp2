import java.io.IOException;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) throws IOException {

		int num = 0;
		
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			kors[i] = 0;
			engs[i] = 0;
			maths[i] = 0;
		}

		나돌아갈래: 
		while (true) {
			System.out.println("┌─────────────────────┐");
			System.out.println("│	 메인 메뉴	      │");
			System.out.println("└─────────────────────┘");

			System.out.print("\n1.성적 입력\n2.성적 출력\n3.종료\n\n선택 > ");
			num = scan.nextInt();

			switch (num) {
			case 1:
			{
				int kor = 0;
				int eng = 0;
				int math = 0;

				System.out.println("┌─────────────────────┐");
				System.out.println("│	 성적 입력	      │");
				System.out.println("└─────────────────────┘");

				for (int i = 0; i < 3; i++) {
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
					System.out.println("---------------------------");

					kors[i] = kor;
					engs[i] = eng;
					maths[i] = math;
				}
			}
				break;
			case 2:
			{
				int kor = 0;
				int eng = 0;
				int math = 0;
				
				int total;
				float avg;

				System.out.println("┌─────────────────────┐");
				System.out.println("│	 성적 출력	      │");
				System.out.println("└─────────────────────┘");

				for (int i = 0; i < 3; i++) {
					kor = kors[i];
					eng = engs[i];
					math = maths[i];
					
					total = kor + eng + math;
					avg = total / 3;
					
					System.out.printf("국어 %d : %d\n", i,kor);
					System.out.printf("영어 %d : %d\n", i,eng);
					System.out.printf("수학 %d : %d\n", i,math);
					System.out.printf("총점 : %d\n", total);
					System.out.printf("총점 : %6.2f\n", avg);
					System.out.println("---------------------------");
				}
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