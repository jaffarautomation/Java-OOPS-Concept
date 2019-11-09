package Arrays;

public class SimpleArrays {
	
	
	public static void main(String args[])
	
	{
		
		
		//This is static array, and its memory size is of 5
		  int arrayint[] = new int[5];
		  
		 System.out.println( arrayint.length);
		 
		 arrayint[0 ] =23;
		 arrayint[1] =34;
		 
		 //Below code will print the Hashcode or address of arrayint.
		 //Because we are trying to print the arrayint which stores the reference or address of array type integer.
		 
		 System.out.println(arrayint);

		//This will print the value of array store in 0th index 
		int r = arrayint[0];
		 System.out.println(r);
		 
		 
		 //To print the actual values of array, we need to iterate it, with for loop
		 for (int i : arrayint)
		 
		     {
			 
			 System.out.println(i);
			 
			 }
		  
		
	}

}
