package Lesson3;

public class ConstructorClass {
	
	public static void main(String[] args )
	
	{
	
	
		
		Constructor cube1 = new Constructor();
		// so when this class is run for the first time, the value of all instance variable
		// is zero. 
		//it is also used to as sign some particular value to variable, if you want some
		// specific values in first run time other than zero.
		
		System.out.println(cube1.getvolume());
	
	
	
		Constructor cube2 = new Constructor(9,8,5);
		
		{
					System.out.println(cube2.getvolume());
			
		}		
		
	}

}
