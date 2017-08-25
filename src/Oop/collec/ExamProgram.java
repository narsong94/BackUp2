package Oop.collec;

import java.util.Scanner;

public class ExamProgram {	
	public static void main(String[] args) {		
		//Exam exam = new Exam(0, 0, 0);								// 조립형
		//ExamConsole console = new ExamConsole(exam);	// 조립형
		//console.setExam(exam);											// 조립형
		
		ExamConsole console = new ExamConsole();				// 일체형
		
		int menu;
		
		EXIT:
		while(true) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.print();
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
