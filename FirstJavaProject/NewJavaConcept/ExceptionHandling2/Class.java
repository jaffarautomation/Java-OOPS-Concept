package ExceptionHandling2;

import java.io.IOException;

public class Class {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Throw r = new Throw();
		//r.show();
// As in throw class we have use throw keyword in method show(), it became necessary to handle this exception when you calling in other class.
//otherwise it will throw an error.		it can be handle by try and catch 
		
		try{
		r.show();
		
// now we have write the show method inside the try method and catch the io exception.
		}
		
		catch ( IOException e)
		{
			
			System.out.println("Handle the exceptions");
		}
		
		catch  (NumberFormatException e)
		{System.out.println("Handle the exceptions N");}
	}

	
	//Also if you handle the exception for show method initially by using try and catch 
	//and declare the catch method for io exception again it will throw the error.
	//for understanding delete the throw keyword from show method in throw class.
}
