package PracticeBook;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("sum is: "+(x+y));
		System.out.println("difference is: "+(x-y));
		System.out.println("product is: "+x*y);
		System.out.println("division is: "+x/y);
		System.out.println("reminder is: "+x%y);

	}

}
