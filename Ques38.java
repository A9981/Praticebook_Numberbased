package PracticeBook;

import java.util.Scanner;

public class Ques38 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number");
			int n=sc.nextInt();
			int Esum=0,Osum=0,Dsum=0;
			do {
				int r=n%10;
				if(r%2==0)
				  Esum=Esum+r;
				else
				  Osum=Osum+r;
				n=n/10;
				 Dsum=Esum-Osum;
			}while(n!=0);
			if(Dsum<0)
				Dsum=Dsum*-1;
			System.out.println("difference between Sum of even and odd digit is:"+Dsum);
		}

	}

