package HomeWork;

public class �۳���2 {
	public static void main(String[] args) {
		int cnt = 'Z' - 'A' + 1;
		
		for (int i = 0; i < 50; i++) {
			System.out.printf("%c", 'A' + (i % cnt)); 
		}
	}
}
