package PracticeBook;

import java.util.Scanner;

public class Ques54 {
	static double percCalculate(double d,double n) {
		double prod=d*n/100;
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter MRP of prodect and discount percentage");
		double MRP=sc.nextInt();
	    double perc=sc.nextInt();
	    double RP=MRP-percCalculate(MRP,perc);
	    System.out.println("rate of product:"+RP);
	}

}
