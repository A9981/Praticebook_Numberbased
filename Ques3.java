package PracticeBook;

import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle in cm: ");
		double x=sc.nextDouble();
		System.out.println("Enter width of rectangle in cm: ");
		double y=sc.nextDouble();
		
		double area=x*y;
		double perm=2*(x+y);
		
		System.out.println("Area of rectangle: "+area+"cm^2");
		System.out.println("Perimeter of rectangle: "+perm+"cm");
	}

}
