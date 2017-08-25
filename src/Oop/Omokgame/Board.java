package Oop.Omokgame;

import java.util.Scanner;

public class Board {
	
	private int ox;
	private int oy;
	

	public Board(){
		this(25, 25);
	}
	
	public Board(int x, int y) {
		this.ox = x;
		this.oy = y;
	}
	
	public void create() {
		System.out.println("�� ����");
	}

	public void print() {
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++)
				if (x == ox && y == oy)
					System.out.print("��");
				else
					System.out.print("��");

			System.out.println();
		}
	}

	public void put(Omok omok) {
		ox = omok.getX();
		oy = omok.getY();
	}
}
