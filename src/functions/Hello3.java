package functions;

import java.util.Scanner;

public class Hello3 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int menu;
		
		EXIT:
		while(true) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputExam(kors, engs, maths);
				break;
			case 2:
				printExam(kors, engs, maths);
				break;
			case 3:
				break EXIT;
			}
		}
	}

	private static void inputExam(int[] kors, int[] engs, int[] maths) {
		
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

	private static void printExam(int[] kors, int[] engs, int[] maths) {
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

	private static int inputMenu() {
		int num;
		
		System.out.println("┌─────────────────────┐");
		System.out.println("│	 메인 메뉴	      │");
		System.out.println("└─────────────────────┘");

		System.out.print("\n1.성적 입력\n2.성적 출력\n3.종료\n\n선택 > ");
		num = scan.nextInt();
		
		return num;
	}

}
