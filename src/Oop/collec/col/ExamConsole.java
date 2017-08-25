package Oop.collec.col;

/*
Has A
- Composition Has A
- Association Has A
- Aggregation Has A -> �̰� �� �ž�
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

		System.out.println("����������������������������������������������");
		System.out.println("��    				���� �Է�		               ��");
		System.out.println("����������������������������������������������");

		do {
			if (kor < 0 || kor > 100)
				System.out.print("���� ����\n");
			System.out.print("���� : ");
			kor = scan.nextInt();
		} while (kor < 0 || kor > 100);
		do {
			if (eng < 0 || eng > 100)
				System.out.print("���� ����\n");
			System.out.print("���� : ");
			eng = scan.nextInt();
		} while (eng < 0 || eng > 100);
		do {
			if (math < 0 || math > 100)
				System.out.print("���� ����\n");
			System.out.print("���� : ");
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

		System.out.println("����������������������������������������������");
		System.out.println("��    				�������		             ��");
		System.out.println("����������������������������������������������");

		for (int i = 0; i < exams.size(); i++) {
//			Exam exam = exams[i];
			Exam exam = exams.get(i);
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			total = exam.total();
			avg = exam.avg();
			
			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);
			System.out.printf("���� : %d\n", total);
			System.out.printf("���� : %6.2f\n", avg);
			System.out.println("---------------------------");
		}

	}
}
