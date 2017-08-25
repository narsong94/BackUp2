package functions;

import java.util.Scanner;

public class Omok {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int ox, oy;

		// 판 생성
		makePan();

		// 위치 입력
		System.out.print("x sp y : ");
		ox = scan.nextInt();
		oy = scan.nextInt();

		// 판 새로 고침
		newPan(ox, oy);
	}

	private static void newPan(int ox, int oy) 
	{
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				if (x == ox && y == oy)
					System.out.print("○");
				else
					System.out.print("┼");

			System.out.println();
		}
	}

	private static void makePan() 
	{
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print("┼");

			System.out.println();
		}
	}
}
