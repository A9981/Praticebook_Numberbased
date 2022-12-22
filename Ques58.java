package PracticeBook;

import java.util.Scanner;

public class Ques58 {
	static double powNum(double d,double n) {
		double prod=1;
		while(n>=1)
		{
			prod=prod*d;
			n--;
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pv,interest nd time");
		double Pv=sc.nextDouble();
	    double i=sc.nextDouble();
	    i=i/100;
	    double N=sc.nextDouble();
		double FV=Pv*powNum((i+1),N);
	    System.out.println(FV);
	}

}
