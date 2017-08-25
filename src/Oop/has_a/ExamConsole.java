package Oop.has_a;

import java.util.Scanner;

public class ExamConsole {
	
	private Exam exam = new Exam();		// ��ü��
//	private Exam exam;							// ������
	
//	public ExamConsole(Exam exam) {	// ������
//		this.exam = exam;
//	}
//	public setExam(Exam exam) {	// ������
//		this.exam = exam;
//	}
	
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

		System.out.println("����������������������������������������������");
		System.out.println("��    				�������		             ��");
		System.out.println("����������������������������������������������");

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
