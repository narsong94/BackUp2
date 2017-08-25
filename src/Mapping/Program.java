package Mapping;

public class Program {
	public static void main(String[] args) {
		Integer y = 5;
		System.out.println(y);
		
		// int ii = 3.intValue();
		int s = new String("hello").length();
		int s2 = "hello".length();
		System.out.println(new Integer(3).intValue() + " " +s + " " +  s2);
		
		int n = 3;
		double d = 5.5;
		String si = Integer.toString(n);
		String si2 = String.valueOf(n);
		String sd = Double.toString(d);
		System.out.println(si + " " +si2 + " " +  sd);
		
		double dou = Double.parseDouble(sd);
		System.out.println(dou);	
		
		String n1 = "아이유";
		String n2 = new String("아이유");
		System.out.println(n1 == n2);
		System.out.println(n1.equals(n2));
		
		String str = "hello";
		String str2 = str.replace("l", "t");
		System.out.println(str + " " + str2);
		
		String str3 = "Photo.jpg";
		System.out.println(str3.length());
		System.out.println(str3.indexOf("."));
		System.out.println(str3.substring(0, str3.indexOf(".")));
		
		String name = "유재석, 박명수, 정준하, 하하, 양세형";
		String[] names = name.split(","); 
		System.out.println(names[1]);
	}
}
