package Oop.collec.col;

import java.util.Iterator;

public class GenericList<Generic>  implements Iterable<Generic>{

	private Generic[] list;
	private int index;
	private int capacity;
	// private int current;

	public GenericList() {
		list = (Generic[]) new Object[3];
		index = 0;
		capacity = 3;
		//current = -1;
	}

	public void add(Object exam) {
		if (index >= capacity) {
			Generic[] tmp = (Generic[]) new Object[capacity + 2];
			for (int i = 0; i < list.length; i++) {
				tmp[i] = list[i];
			}
			list = tmp;
			capacity += 2;
		}
		list[index++] = (Generic) exam;
	}

	public Object get(int i) {
		return list[i];
	}

	public int size() {
		return index;
	}

	// *************************데이터 조회*************************//

	class GIterator implements Iterator<Generic>{
		private int current;
		
		public GIterator() {
			current = -1;
		}
		
		public boolean hasNext() {
			++current;
			return index > current;
		}

		public Generic next() {
			return list[current];
		}
	}
	
	public Iterator iterator() {
		return new GIterator();
	}
}