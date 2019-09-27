package Lesson13Abstract;

abstract class Mahesh {

	public  void calling(){
		
		System.out.println("Calling...");
	}
	
	public abstract void dance();
	// these are called abstract method. in which no boby is defined.
	//if there is one abstract method present in class, then you need to defined the class as abstrat.
	public abstract void move();	
	//  A class can have abstract as well as non- abstract method.
	// If class is abstract then you cant create the object of that class.

	Mahesh()
	{
		
		System.out.println("In mahesh cont");
		
	}
}
