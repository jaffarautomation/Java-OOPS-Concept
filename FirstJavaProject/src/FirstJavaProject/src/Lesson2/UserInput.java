package Lesson2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Some Number");
       int X = scan.nextInt();
       System.out.println("The Entered Number is");
       System.out.print(X);
	}

}
