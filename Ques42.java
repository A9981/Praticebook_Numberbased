package PracticeBook;

import java.util.Scanner;

public class Ques42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int count=0;
		do {
			if(n%2==1)
				count=count+n%2;
			
				n=n/2;
		}while(n!=0);
		System.out.println("Setted number is "+count);
	}

}
