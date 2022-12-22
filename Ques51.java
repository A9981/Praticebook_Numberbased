package PracticeBook;

public class Ques51 {
	static byte by;
	static short s;
	static int i;
	static boolean b;
	static float f;
	static double d;
	static char c;
	static long l;
	
	static void display() {
		System.out.println("default value of byte:"+by);
		System.out.println("default value of short:"+s);
		System.out.println("default value of int:"+i);
		System.out.println("default value of boolean:"+b);
		System.out.println("default value of float:"+f);
		System.out.println("default value of double:"+d);
		System.out.println("default value of char:"+c);
		System.out.println("default value of long:"+l);
		
	}

	public static void main(String[] args) {
		Ques51 q=new Ques51();
		display();
		System.out.println("default value of class:"+q);
		

	}

}
