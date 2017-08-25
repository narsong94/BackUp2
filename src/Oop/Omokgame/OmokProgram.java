package Oop.Omokgame;

public class OmokProgram {

	public static void main(String[] args) {
		
		Board board = new Board();
		Omok omok = new Omok();
		OmokInputForm form = new OmokInputForm();
		
		board.create();
		board.print();
		
		form.print();
		omok.input();
		board.put(omok);
		board.print();
		
	}

}
