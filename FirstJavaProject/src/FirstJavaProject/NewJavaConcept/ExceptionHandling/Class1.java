package ExceptionHandling;

public class Class1 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i, j, k=0;
		i=8; j=0;
		
		//k = i/j;
//so this might give error so we need to write this in try block to catch the exception.		
// if you dont provide the try and catch exception handling then you will get the following error
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
	//	at ExceptionHandling.Class1.main(Class1.java:13)	
		
		
		try
		{
			
			k =i/j;
		}
		catch (ArithmeticException e) // Exception is the main class so we can handle all the exception in here.
		{
			//This block will only execute if any Arithmetic exception 
	          // occurs in try block
			
			System.out.println("Arthimetic Error");
		}
		
		catch (Exception e)
		{
			/* This is a generic Exception handler which means it can handle
	          * all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          */
			
			System.out.println("General error");
		} 

		System.out.println("out of try and catch block");
		System.out.println(k);
		
		
		
		
	}
	
	

}
