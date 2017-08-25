package functions;
import java.io.*;
import java.util.Scanner;

public class FileData {
	public static void main(String[] args) throws IOException {
		int[] nums = new int[] { -1, 15, 6, 8, 99, 45, 23 };

		FileOutputStream fos = new FileOutputStream("res/test.txt");
		PrintStream ps = new PrintStream(fos);

		for (int i = 0; i < 7; i++) {
			ps.printf("%d ", nums[i]); // 문자로 보내는 것
			 //fos.write(nums[i]); // 숫자로 보내는 것 이는 컴이 아스키 코드로 받아들여 파일 실행 시 코드 해당 값 출력 }
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

		System.out.println("시스템 종료");
	}

}
