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
		
		System.out.println("����������������������������������������������");
		System.out.println("��	 ���� �Է�	      ��");
		System.out.println("����������������������������������������������");
		
		System.out.print("\n���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		math = scan.nextInt();
		System.out.print("\n");

		total = kor + eng + math;
		avg = total / 3;

		System.out.println("����������������������������������������������");
		System.out.println("��	 ���� ���	      ��");
		System.out.println("����������������������������������������������");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng );
		System.out.println("���� : " + math);
		System.out.println("���� : " + total);
		System.out.println("��� : " + (int)avg);
		System.out.println("����������������������������������������������");
		
		System.out.printf("\n���� : %d\n", kor);
		System.out.printf("���� : %d\n", eng);		// 16����, �Ǽ��� 16���� ǥ�� ����
		System.out.printf("���� : %d\n", math);
		System.out.printf("���� : %d\n", total);
		System.out.printf("���� : %6.2f\n", avg);
		System.out.println("����������������������������������������������");
		
		System.out.printf("\n%2$d %1$d %2$d\n", 1, 2);
	}
}