package Oop.Omokgame;

import java.util.Scanner;

public class Omok {
	
	private int x;
	private int y;
		
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		setX(x);
		setY(y);
	}
}
