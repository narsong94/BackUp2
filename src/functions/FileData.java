package functions;
import java.io.*;
import java.util.Scanner;

public class FileData {
	public static void main(String[] args) throws IOException {
		int[] nums = new int[] { -1, 15, 6, 8, 99, 45, 23 };

		FileOutputStream fos = new FileOutputStream("res/test.txt");
		PrintStream ps = new PrintStream(fos);

		for (int i = 0; i < 7; i++) {
			ps.printf("%d ", nums[i]); // ���ڷ� ������ ��
			 //fos.write(nums[i]); // ���ڷ� ������ �� �̴� ���� �ƽ�Ű �ڵ�� �޾Ƶ鿩 ���� ���� �� �ڵ� �ش� �� ��� }
		}
		ps.close();
		fos.close();

		
		 FileInputStream fis = new FileInputStream("res/test.txt");
		 Scanner scan = new Scanner(fis);
		
		 int num;
		 while ((num = fis.read()) != -1)
			 System.out.println(num);
		
		 scan.close();
		 fis.close();

		System.out.println("�ý��� ����");
	}

}
