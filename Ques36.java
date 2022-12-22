package PracticeBook;

import java.util.Scanner;

public class Ques36 {
	public static void main(String[] args) {
		int n = 18;
		int m=27;
		int gcd = gcdN(n,m);
		System.out.println(gcd);
	}

	private static int gcdN(int n, int m) {
		if(m==0)
			return n;
		return gcdN(m,n%m);
	}

}
