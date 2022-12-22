package PracticeBook;

import java.util.Scanner;

public class Ques56 {
	static boolean primeNum(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the range of prime numbers");
		int n=sc.nextInt();
		int p=sc.nextInt();
		int sum=0;
		int s=(n<p)?n:p;
		int b=(n>p)?n:p;
		{
			for(int i=s;i<=b;i++)
			{
				boolean rs=primeNum(i);
				if(rs==true)
				sum=sum+i;
			}
		}
		System.out.println("sum of prime numbers between "+n+" and "+p+" is "+sum);

	}

}
