package Oop;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(1, 1, 1);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌─────────────────────┐");
		System.out.println("│    				성적 입력		               │");
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
			System.out.println("---------------------------");
	}

	public void print() {
		int total;
		float avg;

		System.out.println("┌─────────────────────┐");
		System.out.println("│    				성적출력		             │");
		System.out.println("└─────────────────────┘");

			total = kor + eng + math;
			avg = total / 3;

			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);
			System.out.printf("총점 : %d\n", total);
			System.out.printf("총점 : %6.2f\n", avg);
			System.out.println("---------------------------");
		
	}

}
