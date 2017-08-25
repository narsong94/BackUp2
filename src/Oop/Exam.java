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
	}

	public void print() {
		int total;
		float avg;

		System.out.println("����������������������������������������������");
		System.out.println("��    				�������		             ��");
		System.out.println("����������������������������������������������");

			total = kor + eng + math;
			avg = total / 3;

			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);
			System.out.printf("���� : %d\n", total);
			System.out.printf("���� : %6.2f\n", avg);
			System.out.println("---------------------------");
		
	}

}
