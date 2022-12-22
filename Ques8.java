package PracticeBook;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two integer num");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		String str=(x==y)?"equal":"not equals";
		System.out.println(str);

	}

}
