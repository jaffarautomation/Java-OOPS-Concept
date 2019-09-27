package ExceptionHandling;

class Flowofcontrol 
{
   public static void main(String args[])
   {
	int x = 0;
	int y = 10;
	try{
	   int num= y/x;
	   System.out.println("next-statement: Inside try block");
	} 
        catch(Exception ex)
	{
	   System.out.println("Exception Occurred");
	}
	System.out.println("next-statement: Outside of try-catch");
   }
}

//There are two statements present inside try block.
//Since exception occurred because of first statement, the second statement didn’t execute.
//Hence we can conclude that if an exception occurs then the rest of the try block doesn’t execute and control passes to catch block.

//Flow of control in try/catch/finally blocks:

//If exception occurs in try block’s body then control immediately transferred(skipping rest of the statements in try block) to the catch block.
//Once catch block finished execution then finally block and after that rest of the program.
//If there is no exception occurred in the code which is present in try block then first, the try block gets executed completely and then control gets transferred to finally block (skipping catch blocks).
//If a return statement is encountered either in try or catch block. In this case finally block runs. Control first jumps to finally and then it returned back to return statement.