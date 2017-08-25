import java.io.IOException;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) throws IOException {
		int kor;
		int eng;
		int math;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);

		kor = 60;
		eng = 70;
		math = 80;
		
		System.out.println("┌─────────────────────┐");
		System.out.println("│	 성적 입력	      │");
		System.out.println("└─────────────────────┘");
		
		System.out.print("\n국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		math = scan.nextInt();
		System.out.print("\n");

		total = kor + eng + math;
		avg = total / 3;

		System.out.println("┌─────────────────────┐");
		System.out.println("│	 성적 출력	      │");
		System.out.println("└─────────────────────┘");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng );
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (int)avg);
		System.out.println("───────────────────────");
		
		System.out.printf("\n국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);		// 16진수, 실수는 16진수 표현 ㄴㄴ
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("총점 : %6.2f\n", avg);
		System.out.println("───────────────────────");
		
		System.out.printf("\n%2$d %1$d %2$d\n", 1, 2);
	}
}