package ExceptionHandling2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throw t = new Throw();
		

	}
	
	public void show() throws  IOException {
		
		int x;
		InputStreamReader t = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(t);
		System.out.println("Enter your no");
		x= Integer.parseInt(b.readLine());
		System.out.println(x*x);
	}
	
	// in the ablove code we have throw the io exception
	//now if some user call this method he/she need to handle this exceptions.

	
	
}
