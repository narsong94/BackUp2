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
		
		System.out.println("����������������������������������������������");
		System.out.println("��    				���� �޴�		               ��");
		System.out.println("����������������������������������������������");

		System.out.print("\n1.���� �Է�\n2.���� ���\n3.����\n\n���� > ");
		num = scan.nextInt();
		
		return num;
	}

}
