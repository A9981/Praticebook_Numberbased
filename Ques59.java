package PracticeBook;

import java.util.Scanner;

public class Ques59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two number,in n and r form");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		    // maximum number between n1 and n2 is stored in lcm
		    int lcm = (n1 > n2) ? n1 : n2;

		    // Always true
		    while(true) {
		      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
//System.out.println("The LCM of "+n1+n2+ "is:"+lcm);(also can write like this)
		        break;
		      }
		      ++lcm;
		    }

	}

}
