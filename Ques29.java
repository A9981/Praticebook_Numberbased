package PracticeBook;
//Emirp num-- emirp num is those prime num whose reverse is also a prime num.

import java.util.Scanner;

public class Ques29 {
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		boolean rs=isPrime(n);
		int temp=n;
		if(rs)
		{
			int sum=0;
			do{
				int r=n%10;
				sum=sum*10+r;
				n=n/10;
			}while(n!=0);
			boolean res=isPrime(sum);
			if(res==true)
				System.out.println(temp+" is emirp number");
			else
				System.out.println(temp+" is not a emirp number");
		}
		else
			System.out.println(temp+" is not a emirp number");
	}

}
