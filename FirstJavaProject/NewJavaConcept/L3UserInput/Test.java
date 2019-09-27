package L3UserInput;

import java.util.*;
public class Test  {

 static int  no ;
	static String name;
	static double d;
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner (System.in);
		// here system .in mean we are telling java that we will provide input by console i.e keyboard.
		
		
		System.out.println("ENter no");
		no =s.nextInt();
		// this method nextint tell java what kind of input is i.e integer  or string  or float.
		// it is for integer.
		System.out.println("Square is " + no*no);
		
		System.out.println("Enter your name");
		name=s.next();
		//next()method is use for string

		System.out.println("Your Name is  :" + name);
		
		System.out.print("Enter your salary: ");  
        double d = s.nextDouble();  
        System.out.print("Enter your salary: " + d);
        //nextDouble is use for double
	}
}
