package Structured_data;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {
		
		Lotto[] lottos = new Lotto[6];
		
		gen(lottos);
		print(lottos);
		sort(lottos);
		print(lottos);
	}

	private static void sort(Lotto[] lottos) {		
		for (int j = 0; j < 5; j++) {
			for (int i = 0, tmp; i < 5 - j; i++) {
				if (lottos[i].num > lottos[i + 1].num) {
					tmp = lottos[i].num;
					lottos[i].num = lottos[i + 1].num;
					lottos[i + 1].num = tmp;
				}
			}
		}

	}

	private static void print(Lotto[] lottos) {
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", lottos[i].num);
		System.out.println();

	}

	private static void gen(Lotto[] lottos) {
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			lottos[i] = new Lotto(); 
			lottos[i].num = rand.nextInt(45) + 1;
		}

	}
}
