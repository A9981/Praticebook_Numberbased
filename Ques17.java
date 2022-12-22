package PracticeBook;

import java.util.Scanner;

public class Ques17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any month num");
		int mon=sc.nextInt();
		
		if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
			System.out.println(mon+" has 31 days");
		
		else if(mon==4||mon==6||mon==9||mon==11)
			System.out.println(mon+" has 30 days");
		
		else
			System.out.println(mon+" has 28 or 29 days");

	}

}
