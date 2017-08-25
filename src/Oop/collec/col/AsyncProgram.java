package Oop.collec.col;

import Oop.collec.col.GenericList.GIterator;

public class AsyncProgram {
	
	public static void main(String[] args) {
			GenericList<Integer> list = new GenericList<>();
			
			for(int i=0; i<100; i++) 
				list.add(i+1);
			
/*			Thread th1 = new Thread(new Runnable() {
				@Override
				public void run() {
					download(list, 1);
				}
			});
*/			
			Thread th1 = new Thread(()->{download(list, 1);});
			th1.start();
			
//			new Thread(()->{download(list, 1);}).start();
			download(list, 2);
			
			System.out.println("프로그램 종료");
	}

	private static void download(GenericList<Integer> list, int num) {

		//GIterator iter = list.iterator();
		
//		while(iter.hasNext()) 
//			System.out.printf("%d : %d%%\n", num, iter.next());
		
		for(Integer n : list)
	         System.out.printf("%d : %d%%\n", num, n);
	}

}
