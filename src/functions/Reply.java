package functions;
import java.util.Scanner;

public class Reply {
	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);

		�����ư���: 
		while (true) {
			System.out.println("����������������������������������������������");
			System.out.println("��	 ���� �޴�	      ��");
			System.out.println("����������������������������������������������");

			System.out.print("\n1.���� �Է�\n2.���� ���\n3.����\n\n���� > ");
			num = scan.nextInt();

			switch (num) {
			case 1:
				System.out.println("����������������������������������������������");
				System.out.println("��	 ���� �Է�	      ��");
				System.out.println("����������������������������������������������");

				do {
					if (kor < 0 || kor > 100)
						System.out.print("���� ����\n");
					System.out.print("���� : ");
					kor = scan.nextInt();
				} while (kor < 0 || kor > 100);
				do {
					if (eng < 0 || eng > 100)
						System.out.print("���� ����\n");
					System.out.print("���� : ");
					eng = scan.nextInt();
				} while (eng < 0 || eng > 100);
				do {
					if (math < 0 || math > 100)
						System.out.print("���� ����\n");
					System.out.print("���� : ");
					math = scan.nextInt();
				} while (math < 0 || math > 100);
				break;
			case 2:
				total = kor + eng + math;
				avg = total / 3;

				System.out.println("����������������������������������������������");
				System.out.println("��	 ���� ���	      ��");
				System.out.println("����������������������������������������������");

				for(int i=0; i<3; i++) {
					System.out.printf("���� : %d\n", kor);
					System.out.printf("���� : %d\n", eng);
					System.out.printf("���� : %d\n", math);
					System.out.printf("���� : %d\n", total);
					System.out.printf("���� : %6.2f\n", avg);
					System.out.println("---------------------------");
				}
				break;
			case 3:
				break �����ư���;
			default:
				System.out.print("�߸��� �Է��Դϴ�. ��ȣ : 1 ~ 3\n");
			}
		}
	}
}
