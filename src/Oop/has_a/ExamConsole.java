package Oop.has_a;

import java.util.Scanner;

public class ExamConsole {
	
	private Exam exam = new Exam();		// 일체형
//	private Exam exam;							// 조립형
	
//	public ExamConsole(Exam exam) {	// 조립형
//		this.exam = exam;
//	}
//	public setExam(Exam exam) {	// 조립형
//		this.exam = exam;
//	}
	
	public void input() {		
		Scanner scan = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;

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
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void print() {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total;
		float avg;

		System.out.println("┌─────────────────────┐");
		System.out.println("│    				성적출력		             │");
		System.out.println("└─────────────────────┘");

		total = exam.total();
		avg = exam.avg();

		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("총점 : %6.2f\n", avg);
		System.out.println("---------------------------");

	}
}
