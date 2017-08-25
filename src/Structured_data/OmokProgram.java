package Structured_data;

import java.util.Scanner;

public class OmokProgram {
	public static void main(String[] args) {
		Omok omok = new Omok();
		
		printPan();
		Input(omok);
		printPan(omok);
	}

	private static void Input(Omok omok) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x sp y : ");
		omok.x = scan.nextInt();
		omok.y = scan.nextInt();
	}

	private static void printPan(Omok omok) 
	{
		int ox = omok.x;
		int oy = omok.y;
		
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				if (x == ox && y == oy)
					System.out.print("¡Û");
				else
					System.out.print("¦«");

			System.out.println();
		}
	}

	private static void printPan() 
	{
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				System.out.print("¦«");

			System.out.println();
		}
	}
}
