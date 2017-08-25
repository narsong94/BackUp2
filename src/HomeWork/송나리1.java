package HomeWork;

public class ¼Û³ª¸®1 {
	public static void main(String[] args) {
		int cnt = 'Z' - 'A' + 1;
		
		for (int i = cnt - 1; i >= 0; i--) {
			System.out.printf("%c", 'A'+i); 
		}
		
		System.out.println(""); 
		
		for (int i = 0; i<cnt; i++) {
			System.out.printf("%c", 'Z'-i); 
		}
	}
}
