package PracticeBook;
import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter radius of the circle");
			double r=sc.nextDouble();
			double pi=22.0/7.0;
			
			double Area=pi*r*r;
			double Circumtance=2*r*pi;
			
			
			
			System.out.println("area of circle "+Area);
			System.out.println("Circumtance of circle "+Circumtance);
			
			

		}
}
