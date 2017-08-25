package HomeWork;

import java.io.*;
import java.util.Scanner;

public class AvgProgram {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Z:\\숙제제출\\2017-07-17 로또구조체, 데이터분석(평균)\\data\\data.txt");
		Scanner scan = new Scanner(fis);

		double num, sum = 0;
		int cnt = 0;
		
		while (scan.hasNext()) {	
			num = scan.nextFloat();
			sum += num;
			cnt++;
		}
		
		System.out.printf("Sum : %.2f\n", sum);
		System.out.printf("Avg : %.2f", sum / cnt);

		scan.close();
		fis.close();
	}
}
