package PracticeBook;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int x=sc.nextInt();
		
		if(x>0)
			System.out.println(x+" is a positive num");
		
		if(x<0)
			System.out.println(x+" is a negative num");
		
		if(x==0)
			System.out.println(x+" equals to zero");
	}

	

}
