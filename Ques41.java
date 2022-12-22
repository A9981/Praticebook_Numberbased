package PracticeBook;

import java.util.Scanner;

public class Ques41 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any num");
	int n=sc.nextInt();
	double count=0,sum=0;
	do {
		int r=n%10;
		count++;
		sum=sum+r;
		n=n/10;
	}while(n!=0);
	System.out.println(sum/count);

	}

}
