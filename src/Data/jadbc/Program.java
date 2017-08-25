package Data.jadbc;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	private static NoticeService service;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		service = new NoticeService();
		
		EXIT: 
		while (true) {
			switch (inputMenu()) {
			case 1:
				inputNotice();
				break;
			case 2:
				listNotice();
				break;
			case 3:
				break EXIT;
			}
		}
	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("┌─────────────────────┐");
		System.out.println("│    				메인 메뉴		      │");
		System.out.println("└─────────────────────┘");

		System.out.print("\n1.게시판 입력\n2.게시판 조회\n3.종료\n\n선택 > ");
		num = scan.nextInt();
		
		return num;
	}

	private static void inputNotice() throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		String id, title, content;
		
		System.out.print("ID : ");
		id = scan.nextLine();
		System.out.print("TITLE : ");
		title = scan.nextLine();
		System.out.print("CONTENT : ");
		content = scan.nextLine();
		
		service.insert(id, title, content);
	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList();
		
		for(Notice n : list) 
			System.out.printf("ID : %s TITLE : %s HIT : %s\n", n.getId(), n.getTitle(), n.getHit());
	}
}
