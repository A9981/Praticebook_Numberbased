package PracticeBook;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double z=sc.nextDouble();
	    
		double big=x;
		
		if(y>big)
			big=y;
		
		if(z>big)
			big=z;
		
		System.out.println("the biggest num is "+big);
	}

	

}
