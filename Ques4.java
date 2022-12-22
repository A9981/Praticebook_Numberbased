package PracticeBook;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square in cm");
		double side=sc.nextDouble();
		double area=side*side;
		double perm=4*side;
		
		
		System.out.println("side of square: "+side+"cm");
		System.out.println("area of square: "+area+"cm^2");
		System.out.println("perimeter of square: "+perm+"cm");

	}

}
