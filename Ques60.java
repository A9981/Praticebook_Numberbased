package PracticeBook;

import java.util.Scanner;

public class Ques60 {
	static int factNum(int n) {
		int prod=1;
		while(n>0)
		{
			prod=n*prod;
			n--;
		}
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two number,in n and r form");
		int n=sc.nextInt();
		int r=sc.nextInt();
		int NCR=factNum(n)/(factNum(n-r)*factNum(r));
		System.out.println("NCR of "+n+" and "+r+" is: "+NCR);
		int NPR=factNum(n)/factNum(n-r);
		System.out.println("NPR of "+n+" and "+r+" is: "+NPR);
		

	}

}
