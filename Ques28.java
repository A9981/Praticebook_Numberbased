package PracticeBook;

import java.util.Scanner;

public class Ques28 {
	static int countdigits(int n){
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	static int pow(int n,int p) {
		int pw=1;
		
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int sq=n*n;
		int c=countdigits(n);
		int a=pow(10,c);
		int r=sq%a;
		if(r==n)
			System.out.println(n+" is a Automorphic number");
		else
			System.out.println(n+" is not automorphic number");
		}
		
			


}
