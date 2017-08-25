
public class Omok {
	public static void main(String[] args) {
		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 20; x++) {
				if(x <= y && y < 15-x) System.out.print("¡Û");
				else System.out.print("¦«");
			}
			System.out.println();
		}
	}
}
