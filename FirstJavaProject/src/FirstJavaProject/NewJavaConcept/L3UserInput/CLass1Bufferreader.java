package L3UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLass1Bufferreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String name; 
		int x;
		
		InputStreamReader t = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(t);
		
		System.out.println("Enter your Name");
		name= b.readLine();
	
	
		System.out.println("Your Name is " + name);
		
		//In below we will also use try and catch i.e exception handling.
		//In this run -time exception is covered i.e no format exception
		
		try {
			
			System.out.println("Enter your no");
		x= Integer.parseInt(b.readLine());
		// the parameter of parseint will have ->> s - a String containing the int representation to be parsed
		// now we have converted the readline to integer. 
		//Readline method reads instring format . 
		//Even you enter the no it will like "45" i.e sting format.
		//To remove the string quote we use the interger.pareint method.
		System.out.println("Your no  is " + x);
			
		}
		
		catch (NumberFormatException e){
			
			System.out.println("Please enter the valid string format in int type ");
			
			
		}
		
	//	System.out.println("Enter your no");
		//x= Integer.parseInt(b.readLine());
		// now we have converted the readline to integer. 
		//Readline method reads instring format . 
		//Even you enter the no it will like "45" i.e sting format.
		//To remove the string quote we use the interger.pareint method.
	//	System.out.println("Your no  is " + x);
	}

}
