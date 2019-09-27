package ExceptionHandling;

class Multiplecatchblock{
	   public static void main(String args[]){
	     try{
	         int a[]=new int[7];
	         a[4]=30/0;
	         System.out.println("First print statement in try block");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	        System.out.println("Catch1");
	     }
	  //   In the above example, the first catch block got executed because the code we have written in try block throws ArithmeticException (because we divided the number by zero).
	     
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	        System.out.println("Catch2");
	     }
	     
//In this case, the second catch block got executed because the code throws ArrayIndexOutOfBoundsException. We are trying to access the 11th element of array in above program but the array size is only 7.	     
	     catch(Exception e){
	        System.out.println("Warning: Some Other exception");
	        System.out.println("Catch3");
	     }
	     
	   System.out.println("Out of try-catch block...");
	  }
	}
