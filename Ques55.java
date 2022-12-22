package PracticeBook;

import java.util.Scanner;

public class Ques55 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four subjects marks:");
		int phy=sc.nextInt();
		int chem=sc.nextInt();
		int math=sc.nextInt();
		int eng=sc.nextInt();
		double perc=(phy+chem+math+eng)*100/400;
		System.out.println("Percentage is:"+perc+"%");
	}

}
