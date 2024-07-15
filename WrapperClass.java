package javaproject;

public class WrapperClass {

	public static void main(String[] args) {
		byte by = 1;
		Byte obj = new Byte(by);
		
		int a=5;
		Integer obj1 = new Integer(a);
		
		char b = 'a';
		Character obj2 = new Character(b);
		
		float c = 10.12f;
		Float obj3 = new Float(c);
		
		double d = 98765432.12345678;
		Double obj4 = new Double(d);
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		byte byt=obj;
		int in = obj1;
		char ch = obj2;
		float fl = obj3;
		double du=obj4;
		
		System.out.println();
		System.out.println(byt);
		System.out.println(in);
		System.out.println(ch);
		System.out.println(fl);
		System.out.println(du);
	}

}
