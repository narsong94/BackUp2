package Oop.collec.col;

public class ExamList {
	
	private Exam[] exams;
	private int index;
	private int capacity;
	
	public ExamList() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
	}

	public void add(Exam exam) {
		if(index >= capacity) {
			Exam[] tmp = new Exam[capacity + 2];
			for(int i=0; i < exams.length; i++) {
				tmp[i] = exams[i];
			}
			exams = tmp;
			capacity += 2;
		}
		exams[index++] = exam;
	}

	public Exam get(int i) {
		return exams[i];
	}

	public int size() {
		return index;
	}
}