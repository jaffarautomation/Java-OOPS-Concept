package Lesson15FinalKeyword;

public class Class1 {

	
	final static  int x = 4; // final initialize, if it is not initialize then it should be initiazlize in staic block
	
	final int y; // blank final variable, this variable must be initialize in constructor
	
	Class1()
	{
		
		y=56;
	}
	
	public static void main(String[] args) {
	
	  //	x=45;
	  	
	  
	  	// error becuase final variable cant be initialize again.
	
		
	//It is considered as a good practice to have constant names in UPPER CASE(CAPS).

	   Class1 r = new Class1();
	   System.out.println(r.y);
	}	
	
}




