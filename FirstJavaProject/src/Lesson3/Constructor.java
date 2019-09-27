package Lesson3;

public class Constructor {

	int lenght;
	int breath;
	int width;
	
	public int getvolume()
	{
		
		return(lenght* breath*width) ;
		
	}

	
	Constructor() // constructor without parmeter
	 {
		 
		 //System.out.println("youtube");
		 //System.out.println(lenght);
		 //System.out.println(breath);
		
		//*************************************************
		
		// in this we have first initialize the values of l,b,w.
		//this means now values are assig as 10,20,30 to l,b,w.
		lenght =10;
		breath =20;
		width =30;
			 
	 }
	
	Constructor(int a, int b, int c)
	{
		lenght =a;
		breath =b;
		width =c;
		
	}
	
	
	
  
}
