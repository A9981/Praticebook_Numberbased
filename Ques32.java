package PracticeBook;

import java.util.Scanner;

public class Ques32 {
	static boolean evilOdius(int n) {
		int count=0;
		do {
			if(n%2==1);
			count=count+n%2;
			
			n=n/2;
		}while(n!=0);
		return count%2==0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		boolean rs=evilOdius(n);
		if(rs==true)
			System.out.println("Evil number");
		else
			System.out.println("odius number");
	}

}
