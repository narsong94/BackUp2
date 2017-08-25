package Oop;

import java.util.Scanner;

public class ExamProgram {	
	public static void main(String[] args) {
		
		Exam exam = new Exam();
		
		int menu;
		
		EXIT:
		while(true) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				exam.input();
				break;
			case 2:
				exam.print();
				break;
			case 3:
				break EXIT;
			}
		}
	}

	public static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("┌─────────────────────┐");
		System.out.println("│    				메인 메뉴		               │");
		System.out.println("└─────────────────────┘");

		System.out.print("\n1.성적 입력\n2.성적 출력\n3.종료\n\n선택 > ");
		num = scan.nextInt();
		
		return num;
	}

}
