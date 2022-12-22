package PracticeBook;

import java.util.Scanner;

public class Ques14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle ammount: ");
		double P=sc.nextDouble();
		System.out.println("enter rate of interest: ");
		double R=sc.nextDouble();
		System.out.println("enter Time period: ");
		double T=sc.nextDouble();
		
		double interest=P*R*T/100;
		System.out.println("interest is: "+interest);			
		}

	}


