package PracticeBook;

import java.util.Scanner;

public class Ques35 {
	static int Squareroot(int num) {
		int sqrt=num/2, t;
		do {
			 t=sqrt;
			sqrt=(t+(num/t))/2;
		}while(t-sqrt>0);
		return sqrt;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		System.out.println("Square root of "+num+" is "+Squareroot(num));

	}

}
