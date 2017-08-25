package functions;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BitmapProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/Ahahahaha.bmp");
		FileOutputStream fos = new FileOutputStream("res/copy.bmp");

		byte[] buf = new byte[1024]; // 바가지

		int len = 0;
		while ((len = (int) fis.read(buf)) != -1) {
			System.out.printf("len : %d\n", len);
			fos.write(buf, 0, len);
		}
//		
//		  byte[] fileHeader = new byte[14]; byte[] bmpHeader = new byte[12];
//		  
//		  fis.read(fileHeader); fis.read(bmpHeader);
//		  
//		  // (int)bmpHeader[4] [][][][4] -> [][][][4] byte[] // (int)bmpHeader[5]
//		  [][][][3] -> [][][3][] // (int)bmpHeader[6] [][][][2] -> [][2][][] //
//		 (int)bmpHeader[7] [][][][1] -> [1][][][]
//		  
//		  int width = ((int)bmpHeader[4]) & 0x000000ff // 0x00000000 -> 한개당 4bit |
//		  ((int)bmpHeader[5] & 0x000000ff << 8) | ((int)bmpHeader[6] & 0x000000ff <<
//		  16) | ((int)bmpHeader[7] & 0x000000ff << 24);
//		 
//		  System.out.printf("width : %d\n", width);
//		 

		fis.close();

	}

}
