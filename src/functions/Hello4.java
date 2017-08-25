package functions;

import java.util.Scanner;

public class Hello4 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		
		for(int i=0; i < 3; i++)
			exams[i] = new Exam();
		
		int menu;
		
		EXIT:
		while(true) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputExam(exams);
				break;
			case 2:
				printExam(exams);
				break;
			case 3:
				break EXIT;
			}
		}
	}

	public static void inputExam(Exam[] exams) {
		
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

			exams[i].kor = kor;
			exams[i].eng = eng;
			exams[i].math = math;
		}
	}

	public static void printExam(Exam[] exams) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		int total;
		float avg;

		System.out.println("┌─────────────────────┐");
		System.out.println("│	 성적 출력	      │");
		System.out.println("└─────────────────────┘");

		for (int i = 0; i < 3; i++) {
			kor = exams[i].kor;
			eng = exams[i].eng;
			math = exams[i].math;
			
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

	public static int inputMenu() {
		int num;
		
		System.out.println("┌─────────────────────┐");
		System.out.println("│	 메인 메뉴	      │");
		System.out.println("└─────────────────────┘");

		System.out.print("\n1.성적 입력\n2.성적 출력\n3.종료\n\n선택 > ");
		num = scan.nextInt();
		
		return num;
	}

}
