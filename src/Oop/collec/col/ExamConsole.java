package Oop.collec.col;

/*
Has A
- Composition Has A
- Association Has A
- Aggregation Has A -> 이거 할 거야
*/

import java.util.Scanner;

public class ExamConsole {

	private ExamList exams;
//	private int index;
//	private int capacity;

	public ExamConsole() {
		exams = new ExamList();
//		index = 0;
//		capacity = 3;
	}

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

		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

//		if(index >= capacity) {
//			Exam[] tmp = new Exam[capacity + 2];
//			for(int i=0; i < exams.length; i++) {
//				tmp[i] = exams[i];
//			}
//			exams = tmp;
//			capacity += 2;
//		}
		
		exams.add(exam);
	}

	public void print() {
		int total;
		float avg;

		System.out.println("┌─────────────────────┐");
		System.out.println("│    				성적출력		             │");
		System.out.println("└─────────────────────┘");

		for (int i = 0; i < exams.size(); i++) {
//			Exam exam = exams[i];
			Exam exam = exams.get(i);
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
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
}
