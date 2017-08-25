package Oop.collec.col;

import java.util.*;

import Oop.collec.col.GenericList.GIterator;

public class TestProgram {
	public static void main(String[] args) {

		Map<String, String> student = new HashMap<>();
	      
	    student.put("이름", "차명건");
	    student.put("나이", "아저씨 26");
	    
	    for(String key : student.keySet())
	         System.out.printf("key :  %s, value : %s \n ",key,student.get(key));
	    
	    
		
/*		
		Set set = new LinkedHashSet();
		
		set.add(9);
		set.add(4);
		set.add(8);
		set.add(20);
		set.add(9);
		set.add(4);
		set.add(7);
		set.add(2);
		set.add(5);
		
		
		for(Object s : set)
			System.out.println(s);
*/		
		/*		GenericList list = new GenericList();
		list.add("Hello");
		list.add("Hello2");
		list.add("Hello3");
		list.add("Hello4");
		for(int i=0; i<list.size(); i++) 
			System.out.println(list.get(i));
		
		GIterator iter = list.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
*/		
	}
}
