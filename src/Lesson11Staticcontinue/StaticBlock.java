package Lesson11Staticcontinue;

public class StaticBlock {
	
	static int num1;
	int e =3;
	
	static {
		
		num1 =56;
		
		System.out.println("Static block 1");
		System.out.println(num1);
	}
	
   static {
		
		num1 =45;
		System.out.println("Static block 2");
		System.out.println(num1);
	}
	
   
	

	  
	public static void main(String[] args)
	{
		Staricvar ob = new Staricvar();
		ob.show1();
		
 	
	//	System.out.println(e);
		// above code has thrown an error, becuase the non variable variable
		// can be call in static method directly
		
		System.out.println(num1);
		// now values of num1 is over written by second static block.
		//Also num1 is called directly because it is a static variable.
		//A static variable can be call in other static method.
	}

}
