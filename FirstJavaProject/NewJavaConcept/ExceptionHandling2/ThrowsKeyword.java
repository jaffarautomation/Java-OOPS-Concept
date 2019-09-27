package ExceptionHandling2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsKeyword {
	
	public static void main(String[] args)
	{
		int x,y;
		int k ;
		try
		{
			InputStreamReader t = new InputStreamReader(System.in);
			BufferedReader r =new BufferedReader(t);
			
			System.out.println("Enter the value of x");
			x= Integer.parseInt(r.readLine());
			System.out.println("Enter the value of y");
			y= Integer.parseInt(r.readLine());
			
			k  = x+y;
			
			if (k<10)
			{
				throw new ArithmeticException();
		// In above we are forcefully calling the AE method.
				//throw new NumberFormatException();
			}	
				
		
			else{
				
				System.out.println(k);
			}
		}
		
		catch (ArithmeticException e)
		{
			
			System.out.println("Min value is 10");
		} 
		catch (NumberFormatException e)
		{
			
			System.out.println("Min value is 12");
		}
		
		 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			System.out.println("In Finally block");
		}
		
		
		
	}

}
