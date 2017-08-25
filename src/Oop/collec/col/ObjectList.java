package Oop.collec.col;

public class ObjectList {
	
	private Object[] exams;
	private int index;
	private int capacity;
	
	public ObjectList() {
		exams = new Object[3];
		index = 0;
		capacity = 3;
	}

	public void add(Object exam) {
		if(index >= capacity) {
			Object[] tmp = new Object[capacity + 2];
			for(int i=0; i < exams.length; i++) {
				tmp[i] = exams[i];
			}
			exams = tmp;
			capacity += 2;
		}
		exams[index++] = exam;
	}

	public Object get(int i) {
		return exams[i];
	}

	public int size() {
		return index;
	}
}