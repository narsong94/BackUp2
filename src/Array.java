import java.io.IOException;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) throws IOException {

		int num = 0;
		
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			kors[i] = 0;
			engs[i] = 0;
			maths[i] = 0;
		}

		�����ư���: 
		while (true) {
			System.out.println("����������������������������������������������");
			System.out.println("��	 ���� �޴�	      ��");
			System.out.println("����������������������������������������������");

			System.out.print("\n1.���� �Է�\n2.���� ���\n3.����\n\n���� > ");
			num = scan.nextInt();

			switch (num) {
			case 1:
			{
				int kor = 0;
				int eng = 0;
				int math = 0;

				System.out.println("����������������������������������������������");
				System.out.println("��	 ���� �Է�	      ��");
				System.out.println("����������������������������������������������");

				for (int i = 0; i < 3; i++) {
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
					System.out.println("---------------------------");

					kors[i] = kor;
					engs[i] = eng;
					maths[i] = math;
				}
			}
				break;
			case 2:
			{
				int kor = 0;
				int eng = 0;
				int math = 0;
				
				int total;
				float avg;

				System.out.println("����������������������������������������������");
				System.out.println("��	 ���� ���	      ��");
				System.out.println("����������������������������������������������");

				for (int i = 0; i < 3; i++) {
					kor = kors[i];
					eng = engs[i];
					math = maths[i];
					
					total = kor + eng + math;
					avg = total / 3;
					
					System.out.printf("���� %d : %d\n", i,kor);
					System.out.printf("���� %d : %d\n", i,eng);
					System.out.printf("���� %d : %d\n", i,math);
					System.out.printf("���� : %d\n", total);
					System.out.printf("���� : %6.2f\n", avg);
					System.out.println("---------------------------");
				}
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