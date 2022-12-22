package PracticeBook;
import java.util.Scanner;

public class Ques40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int prod=0;
		for(int i=1;i<=10;i++)
		{
			prod=n*i;
			System.out.println(n+"*"+i+"="+prod);
		}

	}

}
