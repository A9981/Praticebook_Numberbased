package PracticeBook;


//toBinaryString(int n)-- is a predefined method which is used to
//convert decimal number to binary. 

import java.util.Scanner;

public class Ques31 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int n=sc.nextInt();
    System.out.println(Integer.toBinaryString(n));
	}
}
