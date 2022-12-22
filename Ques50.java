package PracticeBook;

import java.util.*;

public class Ques50 {
	static {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter heigth and width of parallelogram ");
	    int height=sc.nextInt();
		int width=sc.nextInt();
		if(height>0&&width>0)
			 System.out.println(height*width);
			else
				System.out.println("Error");
	}
	public static void main(String[] args) {
//		if(height>0&&width>0)
//			 System.out.println("area of parallelogram is:"+(height*width));
//			else
//				System.out.println("Error");
	}
}
