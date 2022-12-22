package PracticeBook;
import java.util.Scanner;

public class Ques11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight of person");
		double weight=sc.nextDouble();
		System.out.println("Enter height of person");
		double height=sc.nextDouble();
		System.out.println(weight+"kg"+height+"m");
		
		double BMI=weight/height*height;
		System.out.println("BMI of person "+BMI);
		
		

	}

}
