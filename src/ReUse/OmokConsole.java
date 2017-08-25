package ReUse;

import java.util.Scanner;

public class OmokConsole {
	
	Omok omok = new Omok();
	
	public void Input() {
		Scanner scan = new Scanner(System.in);
		int x, y;
		
		System.out.print("x sp y : ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		omok.setX(x);
		omok.setY(y);
	}

	public void printPan() 
	{
		int ox = omok.getX();
		int oy = omok.getY();
		
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				if (x == ox && y == oy)
					System.out.print("¡Û");
				else
					System.out.print("¦«");

			System.out.println();
		}
	}
}
