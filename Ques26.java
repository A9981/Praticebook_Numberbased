package PracticeBook;
import java.util.Scanner;

public class Ques26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character range:");
		char n=sc.next().charAt(0);
		int b=n;
		char n1=sc.next().charAt(0);
		int b1=n1;
		for(;b<=b1;b++) {
			System.out.print(b+" ");
		}
		
		/*if(n>='A' && n<='Z'){
		 for(n=n; n<='Z';n++){
			int b1=n;
			System.out.println(b1);
			}
		}
		else if(n>='a' && n<='z')
		{
		 for(n=n; n<='z';n++){
			int b1=n;
			System.out.println(b1);
			}
		}
		else if(n>='0' && n<='9')
		{
		for(n=n; n<='9';n++){
			int b1=n;
			System.out.println(b1);
			}
		}
		else
			System.out.println("invalid entry");	
	}*/
	}	
}
