package ExceptionHandling;

class NestinTryCatch2{
	   public static void main(String args[]){
		 //Parent try block
	     try{
	    	//Child try block1
	         try{
	            System.out.println("Inside block1");
	            int b =45/0;
	            System.out.println(b);
	         }
	         catch(ArithmeticException e1){
	            System.out.println("Exception: e1");
	         }
	         //Child try block2
	         try{
	            System.out.println("Inside block2");
	            int b =45/0;
	            System.out.println(b);
	         }
	         catch(ArrayIndexOutOfBoundsException e2){
	            System.out.println("Exception: e2");
	         }
	        System.out.println("Just other statement");
	    }
	    catch(ArithmeticException e3){
	    	 System.out.println("Arithmetic Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.println("ArrayIndexOutOfBoundsException");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(Exception e5){
	    	System.out.println("Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    System.out.println("Next statement..");
	  }
	}

//Block1:  I have divided an integer by zero and it caused an ArithmeticException, since the catch of block1 is handling ArithmeticException "Exception: e1" displayed.

//Block2: In block2, ArithmeticException occurred but block 2 catch is only handling ArrayIndexOutOfBoundsException so in this case control jump to the Main try-catch(parent) body and checks for the ArithmeticException catch handler in parent catch blocks. Since catch of parent try block is handling this exception using generic Exception handler that handles all exceptions, the message “Inside parent try catch block” displayed as output.

//Parent try Catch block: No exception occurred here so the “Next statement..” displayed.

//The important point to note here is that whenever the child catch blocks are not handling any exception, the jumps to the parent catch blocks, if the exception is not handled there as well then the program will terminate abruptly showing system generated message.